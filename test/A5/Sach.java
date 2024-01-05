package test.A5;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    List<String> dsChuong;
    String tuaDe, tacGia;
    int soTrang;

    public Sach(Builder builder) {
        this.tuaDe = builder.tuaDe;
        this.tacGia = builder.tacGia;
        this.soTrang = builder.soTrang;
        this.dsChuong = builder.dsChuong;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "dsChuong=" + dsChuong + '\n' +
                ", tuaDe='" + tuaDe + '\n' +
                ", tacGia='" + tacGia + '\n' +
                ", soTrang=" + soTrang + '\n' +
                '}';
    }

    public static class Builder {
        List<String> dsChuong = new ArrayList<>();
        String tuaDe, tacGia;
        int soTrang;

        public Builder addTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder addTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }
        public Builder addSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }
        public Builder addChuong(String n) {
            dsChuong.add(n);
            return this;
        }
        public Sach builder()  {
            return new Sach(this);
        }
    }
}
