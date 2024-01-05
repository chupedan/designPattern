package bt_java.CC1;

public class Context implements Tinh{
    Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    @Override
    public float tinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }
}
