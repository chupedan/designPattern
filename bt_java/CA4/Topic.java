package bt_java.CA4;

import java.util.ArrayList;
import java.util.List;

// subject
public class Topic {
    List<topicObserver> observers = new ArrayList<>();
    List<TinTuc> tinTucs = new ArrayList<>();


    public void themObserver(topicObserver t) {
        if (!observers.contains(t))
            observers.add(t);
    }
    public void xoaObserver(topicObserver t) {
        observers.remove(t);
    }
    public void taoTinMoi(TinTuc tinTuc) {
        tinTucs.add(tinTuc);
        for (topicObserver o : observers) {
            o.taoMoi(tinTuc);

        }
    }
    public void CapNhapTin(TinTuc t) {
        for (TinTuc tin: tinTucs) {
            if (t.id == tin.id) {
                tin.noiDung = t.noiDung;
                for (topicObserver o : observers) {
                    o.taoMoi(t);
                }
                break;
            }
        }
    }

    public static interface topicObserver {
        void taoMoi(TinTuc tinTuc);
        void capNhapTin(TinTuc tinTuc);
    }
}
