package structural.composite.B4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{ // nut trong
    List<KeHoachHocTap> li = new ArrayList<>();

    public KeHoachChung(String name) {
        super(name);
    }

    @Override
    public void add(KeHoachHocTap k) {
        li.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
        li.remove(k);
    }

    @Override
    public int getHocPhi() {
        int tong = 0;
        for (KeHoachHocTap k : li) {
            tong += k.getHocPhi();
        }
        return tong;
    }

    @Override
    public int getTinChi() {
        int tongTC = 0;
        for (KeHoachHocTap k : li) {
            tongTC += k.getTinChi();
        }
        return tongTC;
    }
}
