package bt_java.CD1;

public class MatHang {
    String tenMH;
    int soLg, gia;

    public MatHang(String tenMH, int soLg, int gia) {
        this.tenMH = tenMH;
        this.soLg = soLg;
        this.gia = gia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
