package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList<>();
    public void attach(I_TheoDoiTiGia observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(I_TheoDoiTiGia observer) {
        if (!observers.contains(observer)) {
            observers.remove(observer);
        }
    }
    public void notifyTiGia(float delta) {
        for (var obs : observers) {
            obs.capNhap(delta);;
        }
    }
    public static interface I_TheoDoiTiGia {
        void capNhap(float delta);

    }
}
