package bt_java.A5;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    String tuaDe, tacGia;
    int soTrang;
    List<String> dsChuong;

    public Sach(Builder builder) {
        this.tuaDe = builder.tuaDe;
        this.tacGia = builder.tacGia;
        this.soTrang = builder.soTrang;
        this.dsChuong = builder.dsChuong;
    }

    @Override
    public String toString() {
        return "Sách{" +'\n' +
                "Tựa đề='" + this.tuaDe + '\n' +
                ", Tác giả='" + this.tacGia + '\n' +
                ", Số trang=" + this.soTrang + '\n' +
                ", Danh sách chương=" + this.dsChuong + '\n' +
                '}';
    }

    public static class Builder {
        String tuaDe, tacGia;
        int soTrang;
        List<String> dsChuong = new ArrayList<>();

        public Builder setTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder setTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder setSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }
        public Builder addDsChuong(String n) {
            dsChuong.add(n);
            return this;
        }
        public Sach build() {
            return new Sach(this);
        }
    }
}
