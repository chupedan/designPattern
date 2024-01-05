package bt_java.CC3;

public class KhuyenMai10Max100 implements IKhuyenMai{
    @Override
    public float tienKM(float tongTien) {
        float kM = (float) 0.1 * tongTien;
        return kM < 100 ? kM : 100;
    }
}
