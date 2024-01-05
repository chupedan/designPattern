package bt_java.bt4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    String soTuyen;
    double soKmDi;


    public ChuyenXeNoiThanh(String msChuyen, String hoTenTX, int soXe, double doanhThu, String soTuyen, double soKmDi) {
        super(msChuyen, hoTenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDi = soKmDi;
    }

    @Override
    public String toString() {
        return super.toString() + "ChuyenXeNoiThanh{" +
                "soTuyen='" + soTuyen + '\'' +
                ", soKmDi=" + soKmDi +
                '}';
    }


}
