package bt_java.CD1;

import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    List<MatHang> lsMH = new ArrayList<>();

    void tinhTien() {
        int tong = 0;
        for (MatHang m: lsMH) {
            tong += m.getSoLg() * m.getGia();
        }
    }
}
