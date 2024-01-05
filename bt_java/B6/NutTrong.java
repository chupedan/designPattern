package bt_java.B6;

public class NutTrong implements Nut{

    Nut trai = null, phai = null;
    String content;

    public NutTrong(String content) {
        this.content = content;
    }

    @Override
    public void themTrai(Nut n) {
        trai = n;
    }

    @Override
    public void themPhai(Nut n) {
        phai = n;
    }

    @Override
    public void xoa(Nut n) {
        if (trai == n) {
            trai = null;
        } else if (phai == n) {
            phai = null;
        }
    }

    @Override
    // duyet LNR
    public void duyetCay() {
        if (trai != null) {
            trai.duyetCay();
        }

        // In thông tin của nút hiện tại
        System.out.println(content);

        if (phai != null) {
            phai.duyetCay();
        }
//        System.out.println(content);
    }
}
