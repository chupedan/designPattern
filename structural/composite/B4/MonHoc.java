package structural.composite.B4;

public class MonHoc extends KeHoachHocTap{ // nut la
    int hocPhi; // hoc phi theo tin chi
    int soTC;

    public MonHoc(String name, int hocPhi, int soTC) {
        super(name);
        this.hocPhi = hocPhi;
        this.soTC = soTC;
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public int getHocPhi() {
        return soTC*hocPhi;
    }

    @Override
    public int getTinChi() {
        return soTC;
    }
}
