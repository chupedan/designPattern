package bt_java.CA1;

public class MonHoc {
    String maMH, tenMHl;
    int soTC;

    public MonHoc(String maMH, String tenMHl, int soTC) {
        this.maMH = maMH;
        this.tenMHl = tenMHl;
        this.soTC = soTC;
    }
    public String getMaMH() {
        return maMH;
    }

    public String getTenMHl() {
        return tenMHl;
    }

    public int getSoTC() {
        return soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMH='" + maMH + '\'' +
                ", tenMHl='" + tenMHl + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
