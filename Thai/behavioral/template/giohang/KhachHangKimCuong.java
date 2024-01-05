package behavioral.template.giohang;

import java.util.List;

public class KhachHangKimCuong extends KhachHang{
    public KhachHangKimCuong(List<MatHang> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    protected float tinhChietKhau(float tong) {
        if(tong >= 1500000){
            return (float) (tong * 0.06);
        }
        if (tong>=1000000) {
            return (float) (tong * 0.05);
        }
        return (float) (tong * 0.03);
    }
}
