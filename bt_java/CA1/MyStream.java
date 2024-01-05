package bt_java.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<MyStreamListener> observers = new ArrayList<>();
    public void addListen(MyStreamListener l) {
        observers.add(l);
    }
    public void addEvent(T t) {
        for (MyStreamListener l : observers) {
            l.listen(t);
        }
    }
    public static interface MyStreamListener<T> {
        void listen(T t);
    }
}
