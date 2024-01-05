package bt_java.CB3;

public class TinhDienTheoBac implements TinhTienDienBacThang{
    int min, max;
    int gia;
    TinhTienDienBacThang keTiep;

    public TinhDienTheoBac(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public TinhTienDienBacThang bacKeTiep(TinhTienDienBacThang keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    public int tinhTienDien(int soKw) {
        if (soKw <= max)
            return (soKw - min)*gia;
        return (max - min)*gia + keTiep.tinhTienDien(soKw);
    }

}
