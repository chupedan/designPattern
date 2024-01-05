package test.B4;

public class MonHoc extends KeHoachHocTap{
    int soTC, hocPhi;

    public MonHoc(String name, int soTC, int hocPhi) {
        super(name);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public int getTinChi() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return soTC * hocPhi;
    }
}
