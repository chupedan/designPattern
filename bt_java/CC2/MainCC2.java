package bt_java.CC2;

public class MainCC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien("tri", 10);
        SinhVien sv2 = new SinhVien("vu", 5);
        SinhVien sv3 = new SinhVien("do", 7);
        SinhVien sv4 = new SinhVien("thai", 8);

        qlsv.themSV(sv1);
        qlsv.themSV(sv2);
        qlsv.themSV(sv3);
        qlsv.themSV(sv4);

        qlsv.sapXep(new SoSanhTheoDiem());
        qlsv.inDS();
    }
}
