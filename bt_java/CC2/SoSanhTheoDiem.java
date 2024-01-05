package bt_java.CC2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        double diem1 = t1.getDiem();
        double diem2 = t2.getDiem();

        if (diem1 < diem2) {
            return -1;
        } else if (diem1 > diem2) {
            return 1;
        } else {
            return 0;
        }
    }
}
