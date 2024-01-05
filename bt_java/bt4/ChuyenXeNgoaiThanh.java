package bt_java.bt4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    double soNgayDi;


    public ChuyenXeNgoaiThanh(String msChuyen, String hoTenTX, int soXe, double doanhThu, String noiDen, double soNgayDi) {
        super(msChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return super.toString() + "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDi=" + soNgayDi +
                '}';
    }
}
