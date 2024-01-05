package bt_java.bt4;
//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
//        thu.
//        - Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu
public class ChuyenXe {
    String msChuyen, HoTenTX;
    int soXe;
    double doanhThu;

    public String getMsChuyen() {
        return msChuyen;
    }

    public void setMsChuyen(String msChuyen) {
        this.msChuyen = msChuyen;
    }

    public String getHoTenTX() {
        return HoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        HoTenTX = hoTenTX;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public ChuyenXe(String msChuyen, String hoTenTX, int soXe, double doanhThu) {
        this.msChuyen = msChuyen;
        HoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "msChuyen='" + msChuyen + '\'' +
                ", HoTenTX='" + HoTenTX + '\'' +
                ", soXe=" + soXe +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
