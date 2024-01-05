package diemminhtri_kttkpm.src.bt_java.CE2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
//    public static void duyetDsMH(Iterator<MonHoc> iterator, Consumer<MonHoc> consumer) {
//        while (iterator.hasNext()) {
//            MonHoc m = iterator.next();
//            consumer.accept(m);
//        }
//
//    }

    public static void duyetDsMH(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc m = iterator.next();
            System.out.println("Ten mon hoc: " + m.tenMH);
            System.out.println("So tin chi: " + m.soTC + "\n");
        }

    }
    public static void main(String[] args) {
        List<MonHoc> ls = new ArrayList<>();
        ls.add(new MonHoc("Toan", 3));
        ls.add(new MonHoc("The duc", 4));
        ls.add(new MonHoc("Java", 3));
        ls.add(new MonHoc("MVC", 2));
        Iterator<MonHoc> iterator = ls.iterator();
        duyetDsMH(iterator);
//        duyetDsMH(ls.iterator(), new Consumer<MonHoc>() {
//            @Override
//            public void accept(MonHoc m) {
//                System.out.println("Ten mon hoc: " + m.tenMH);
//                System.out.println("So tin chi: " + m.soTC + "\n");
//            }
//        });

    }
}
