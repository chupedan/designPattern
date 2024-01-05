package test.BieuThuc;

public abstract class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
