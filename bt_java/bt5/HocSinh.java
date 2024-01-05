package bt_java.bt5;

public class HocSinh extends CaNhan{
    String lop, nangKhieu;

    public HocSinh(String hoTen, String diaChi, String sdt, int tuoi, String lop, String nangKhieu) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
    }

    @Override
    public String toString() {
        return super.toString() + "HocSinh{" +
                "lop='" + lop + '\'' +
                ", nangKhieu='" + nangKhieu + '\'' +
                '}';
    }
}
