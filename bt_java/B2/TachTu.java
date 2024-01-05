package bt_java.B2;

public class TachTu implements ITokennize {
    String s;
    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public String[] tokennize() {
        return s.split(" ");
    }
}
