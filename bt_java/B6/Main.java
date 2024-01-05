package bt_java.B6;

public class Main {
    public static void main(String[] args) {
        Nut goc = new NutTrong("goc");
        Nut than = new NutTrong("than");

        Nut nutLa1 = new NutLa("nut la 1");
        Nut nutLa2 = new NutLa("nut la 2");

        goc.themPhai(than);
        than.themPhai(nutLa1);
        than.themTrai(nutLa2);
        goc.duyetCay();

    }
}
