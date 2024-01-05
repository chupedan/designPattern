package bt_java.CA4;

public class ThanhVienA implements Topic.topicObserver {
    Topic t;

    public ThanhVienA(Topic t) {
        this.t = t;
        t.themObserver(this);
    }

    int id;
    String noiDung;
    @Override
    public void taoMoi(TinTuc tinTuc) {
        System.out.println("TVA Tin moi: ");
        inTin(tinTuc);
    }

    @Override
    public void capNhapTin(TinTuc tinTuc) {
        System.out.println("TVA Cap nhap tin: ");
        inTin(tinTuc);
    }
    void inTin(TinTuc t) {
        System.out.println("TVA Id: " + t.id);
        System.out.println("TVA Noi dung: " + t.noiDung);
    }
}
