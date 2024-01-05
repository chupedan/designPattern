package bt_java.B2;

public abstract class TokenDecorator implements ITokennize{
    ITokennize src;

    public TokenDecorator(ITokennize src) {
        this.src = src;
    }

    @Override
    public String[] tokennize() {
        return src.tokennize();
    }

}
