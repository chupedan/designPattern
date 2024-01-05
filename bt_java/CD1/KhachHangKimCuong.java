package bt_java.CD1;

public class KhachHangKimCuong extends KhachHang{
    @Override
    protected float tinhChietKhau(float tong) {
        if (tong >= 1500000)
            return (float) (tong*0.06);
        if (tong >= 1000000)
            return (float) (tong*0.05);
        if (tong >= 500000)
            return (float) (tong*0.03);
        return tong;
    }
}
