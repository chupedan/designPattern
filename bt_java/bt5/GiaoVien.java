package bt_java.bt5;

public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoVien{" +
                "monDay='" + monDay + '\'' +
                ", toBoMon='" + toBoMon + '\'' +
                '}';
    }
}
