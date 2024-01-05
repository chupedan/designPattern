package creational.builder.bt1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader header;
    private ArrayList<CTHD> cthds;

    public HoaDon(Builder b) {
        this.header = b.header;
        this.cthds = b.cthds;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "header=" + header +
                ", cthds=" + cthds +
                '}';
    }

//    @Override
//    public String toString() {
//        StringBuffer builder = new StringBuffer();
//        builder.append("Thong tin hoa don: \n" + header.toString());
//        for (CTHD cthd : cthds)
//            builder.append("\n").append(cthd.toString());
//        return builder.toString();
//    }
    public static class Builder {
        private HoaDonHeader header;
        private ArrayList<CTHD> cthds = new ArrayList<>();

        public Builder addHeader(String maHD, String ngayBan, String tenKH) {
            header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }

        public Builder addCTHD(String sanPham, double soLuong, double donGia, double chietKhau) {
            cthds.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
