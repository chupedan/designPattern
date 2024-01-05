package test.B4;

public abstract class KeHoachHocTap {
    String name;

    public KeHoachHocTap(String name) {
        this.name = name;
    }
    public abstract void add(KeHoachHocTap k);
    public abstract void remove(KeHoachHocTap k);
    public abstract int getTinChi();
    public abstract int getHocPhi();
}
