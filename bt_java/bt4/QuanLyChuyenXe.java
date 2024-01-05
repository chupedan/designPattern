package diemminhtri_kttkpm.src.bt_java.bt4;



import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsChuyenXe = new ArrayList();

    public void them(ChuyenXe cx) {
        dsChuyenXe.add(cx);
    }

    public void inDS() {
        for (ChuyenXe cx : dsChuyenXe) {
            System.out.println(cx.toString());
        }
    }

    double doanhThuXeNoiThanh() {
        double tong = 0;
        for (ChuyenXe cx:dsChuyenXe)
            if (cx instanceof ChuyenXeNoiThanh)
                tong += cx.doanhThu;
        return tong;
    }

    double doanhThuXeNgoaiThanh() {
        double tong = 0;
        for (ChuyenXe cx:dsChuyenXe)
            if (cx instanceof ChuyenXeNgoaiThanh)
                tong += cx.doanhThu;
        return tong;
    }
}
