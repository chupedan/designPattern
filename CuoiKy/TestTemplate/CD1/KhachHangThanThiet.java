package CuoiKy.TestTemplate.CD1;

import java.util.List;

public class KhachHangThanThiet extends KhachHang{
    public KhachHangThanThiet(List<MatHang> dsMH) {
        super(dsMH);
    }

    @Override
    float tinhChietKhau(float tong) {
        if (tong >= 500000) {
            return(float) (tong*0.02);
        }
        return tong;
    }
}
