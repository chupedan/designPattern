package creational.builder.bt1;

public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHD='" + maHD + '\n' +
                ", ngayBan='" + ngayBan + '\n' +
                ", tenKH='" + tenKH + '\n' +
                '}';
    }
}
