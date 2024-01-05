package bt_java.B6;

public class NutLa implements Nut{
    String content;

    public NutLa(String content) {
            this.content = content;
    }


    @Override
    public void themTrai(Nut n) {

    }

    @Override
    public void themPhai(Nut n) {

    }

    @Override
    public void xoa(Nut n) {

    }

    @Override
    public void duyetCay() {
        System.out.println(content);
    }
}
