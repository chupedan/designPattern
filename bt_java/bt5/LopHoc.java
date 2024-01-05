package bt_java.bt5;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    String gvChuNhiem;
    List<HocSinh> dshs = new ArrayList();

//    @Override
    void themHS(HocSinh hs) {
        dshs.add(hs);
    }
    void themGVHD(GiaoVien gv) {

    }
    void inDSHS() {
        for (HocSinh hs : dshs) {
            System.out.println(hs.toString());
        }
    }
    void inDSGVHD() {

    }
}
