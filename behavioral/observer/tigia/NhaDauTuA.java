package behavioral.observer.tigia;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia{
    TiGia tiGia;

    public NhaDauTuA(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    public void huyDangKy() {
        this.tiGia.detach(this);
    }

    @Override
    public void capNhap(float delta) {
        if (delta > 0) {
            System.out.println("Nhà đầu tư A: Bán ra");
        } else {
            System.out.println("Nhà đầu tư A: Mua vào");
        }
    }
}
