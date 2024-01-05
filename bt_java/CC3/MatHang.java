package bt_java.CC3;

public class MatHang {
    String tenMH;
    int soLuong, donGia;

    public MatHang(String tenMH, int soLuong, int donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
