package creational.builder.bt1;

public class CTHD {
    String sanPham;
    double soLuong, donGia, chietKhau;

    public CTHD(String sanPham, double soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham + '\n' +
                ", soLuong=" + soLuong + '\n'+
                ", donGia=" + donGia + '\n' +
                ", chietKhau=" + chietKhau + '\n'+
                '}';
    }
}
