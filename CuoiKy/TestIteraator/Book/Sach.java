package CuoiKy.TestIteraator.Book;

public class Sach {
    String tenSach, tacGia;
    int gia, soTrang, namXB;

    public Sach(String tenSach, String tacGia, int gia, int soTrang, int namXB) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
        this.namXB = namXB;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", gia=" + gia +
                ", soTrang=" + soTrang +
                ", namXB=" + namXB +
                '}';
    }
}
