package bt_java.CD1;

public class KhachHangVang extends KhachHang{
    @Override
    protected float tinhChietKhau(float tong) {
        if (tong >= 1000000)
            return (float) (tong*0.05);
        if (tong >= 500000)
            return (float) (tong*0.03);
        return tong;
    }
}
