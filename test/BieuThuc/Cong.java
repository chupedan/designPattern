package test.BieuThuc;

import structural.decorator.bieuthuc.BieuThuc;
import structural.decorator.bieuthuc.BieuThucDecorator;

public class Cong extends BieuThucDecorator {
    private float toanHang;

    public float getToanHang() {
        return toanHang;
    }

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() + getToanHang();
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + " + " + getToanHang();
    }
}
