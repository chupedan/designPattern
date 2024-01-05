package diemminhtri_kttkpm.src.CuoiKy.TestIteraator.CE2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void inDS(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc m = iterator.next();
            System.out.println("Mon hoc: " + m.getTenMH());
            System.out.println("So tin chi: " + m.getSoTC() + '\n');
        }
    }
    public static void main(String[] args) {
        List<MonHoc> ls = new ArrayList<>();
        ls.add(new MonHoc("Toan 1", 4));
        ls.add(new MonHoc("Toan 2", 4));
        ls.add(new MonHoc("The duc", 1));
        Iterator<MonHoc> iterator = ls.iterator();
        inDS(iterator);
    }
}
