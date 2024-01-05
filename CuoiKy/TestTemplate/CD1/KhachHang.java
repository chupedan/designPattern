package CuoiKy.TestTemplate.CD1;

import java.util.ArrayList;
import java.util.List;

public abstract class KhachHang {
    List<MatHang> dsMH = new ArrayList<>();

    public KhachHang(List<MatHang> dsMH) {
        this.dsMH = dsMH;
    }
    float tinhTien() {
        float tong = 0;
        for (MatHang mh : dsMH) {
            tong += mh.getSoLuong() * mh.getDonGia();
        }
        return tong;
    }
    abstract float tinhChietKhau(float tong);
    public void hienThiGioHang() {
        System.out.println("Danh sach mat hang: ");
        for (MatHang mh : dsMH) {
            System.out.println(mh);
        }
        float tong = tinhTien();
        System.out.println("Tong tien: " + tong);
        float chietKhau = tinhChietKhau(tong);
        System.out.println("Tien chiet khau: " + chietKhau);
        System.out.println("Tien can thanh toan: " +(tong - chietKhau));
    }
}
