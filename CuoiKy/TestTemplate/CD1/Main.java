package CuoiKy.TestTemplate.CD1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MatHang> ls = new ArrayList<>();
        ls.add(new MatHang("Banh", 10, 20000));
        ls.add(new MatHang("Ruou", 20, 15000));
        ls.add(new MatHang("Nuoc", 5, 12000));

        KhachHang hoaDon = new KhachHangVang(ls);
        hoaDon.hienThiGioHang();
    }
}
