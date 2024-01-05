package bt_java.bt5;

import bt_java.bt4.ChuyenXe;

import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS{
    List<CaNhan> dsCaNhan = new ArrayList();

    @Override
    public void them(CaNhan p) {
        dsCaNhan.add(p);
//        return 0;
    }

    @Override
    public int xoa(String ten) {
        for (CaNhan cn : dsCaNhan) {
            if (cn.hoTen.equals(ten))
                dsCaNhan.remove(ten);
        }
        return 0;
    }

    @Override
    public void intDS() {
        for (CaNhan p : dsCaNhan) {
            System.out.println(p.toString());
        }
    }
}
