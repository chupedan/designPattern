package bt_java.CC3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IKhuyenMai khuyenMai;
    IThanhToan thanhToan;
    IVanChuyen vanChuyen;

    List<MatHang> ls = new ArrayList<>();

    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(IVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    public void themMH(MatHang m) {
        ls.add(m);
    }
    public void thanhToan() {
        int tong = 0;
        for (MatHang m: ls) {
            tong += m.soLuong + m.donGia;
        }
        float tienGiamKM = khuyenMai.tienKM(tong);
        float tienGiamThanhToan = thanhToan.tienGiam(tong - tienGiamKM);
        int ngayVC = vanChuyen.soNgay();
        System.out.println("Tong tien hoa don: " + tong);
        System.out.println("Khuyen mai: " + tienGiamKM);
        System.out.println("Tien giam thanh toan: " + tienGiamThanhToan);
        System.out.println("Tien can thanh toan: " + (tong - tienGiamKM - tienGiamThanhToan));
        System.out.println("Ngay van chuyen: " + ngayVC);
    }
}
