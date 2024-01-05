package bt_java.CC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> dsSV = new ArrayList<>();
    public void themSV(SinhVien sv) {
        dsSV.add(sv);
    }
    public void inDS() {
        for (SinhVien sv : dsSV) {
            System.out.println(sv.getTen() + " " + sv.getDiem());
        }
    }


    public void sapXep(ISoSanh<SinhVien> soSanh) {
        for (int i = 0; i < dsSV.size() - 1; i++) {
            for (int j = i + 1; j < dsSV.size(); j++) {
                if (soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0) {
                    SinhVien sv = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, sv);
                }
            }
        }
    }
}
