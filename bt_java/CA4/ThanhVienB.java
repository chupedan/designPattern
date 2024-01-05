package bt_java.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.topicObserver {
    List<TinTuc> ls = new ArrayList<>();
    Topic t;

    public ThanhVienB(Topic t) {
        this.t = t;
        t.themObserver(this);
    }
    @Override
    public void taoMoi(TinTuc tinTuc) {
        System.out.println("TVB Tin moi: ");
        ls.add(0, tinTuc);
        for (TinTuc tin: ls) {
            System.out.println("TVB Id: " + tin.id);
            System.out.println("TVB Noi dung: " + tin.noiDung);
        }
    }

    @Override
    public void capNhapTin(TinTuc t) {
        for (TinTuc tin: ls) {
            if (tin.id == t.id) {
                tin.noiDung = t.noiDung;
                System.out.println("TVB Tin cap nhap: ");
                System.out.println("TVB Id: " + tin.id);
                System.out.println("TVB Noi dung: " + tin.noiDung);
                break;
            }
        }
    }
}
