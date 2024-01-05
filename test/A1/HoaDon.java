package test.A1;

import creational.builder.bt1.CTHD;
import creational.builder.bt1.HoaDonHeader;

import java.util.ArrayList;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private ArrayList<CTHD> cthd;

    @Override
    public String toString() {
        return "HoaDon{" +
                "hoaDonHeader=" + hoaDonHeader +
                ", cthd=" + cthd +
                '}';
    }

    public HoaDon(Builder b) {
        this.hoaDonHeader = b.hoaDonHeader;
        this.cthd = b.cthds;
    }
    public static class Builder {
        private HoaDonHeader hoaDonHeader;
        private ArrayList<CTHD> cthds = new ArrayList<>();
        public Builder addHeader(String maHD, String ngayBan, String tenKH) {
            hoaDonHeader = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, double chieuKhau) {
            cthds.add(new CTHD(sanPham, soLuong, donGia, chieuKhau));
            return this;
        }
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
