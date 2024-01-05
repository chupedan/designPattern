package behavioral.observer.tigia;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia tiGia;

    public NhaDauTuB(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    public void huyDangKy() {
        this.tiGia.detach(this);
    }

    @Override
    public void capNhap(float delta) {
        if (delta > 0) {
            System.out.println("Nhà đầu tư B: Mua vào");
        } else {
            System.out.println("Nhà đầu tư B: Bán ra");
        }
    }
}
