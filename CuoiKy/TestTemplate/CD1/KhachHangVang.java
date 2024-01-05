package CuoiKy.TestTemplate.CD1;

import java.util.List;

public class KhachHangVang extends KhachHang{
    public KhachHangVang(List<MatHang> dsMH) {
        super(dsMH);
    }

    @Override
    float tinhChietKhau(float tong) {
        if (tong >= 1000000) {
            return(float) (tong*0.05);
        }
        if (tong >= 500000) {
            return(float) (tong*0.03);
        }
        return tong;
    }
}
