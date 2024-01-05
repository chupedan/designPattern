package test.A1;

public class CTHD {
    String sanPham;
    int soLuong, donGia;
    double chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", chietKhau=" + chietKhau +
                '}';
    }
}
