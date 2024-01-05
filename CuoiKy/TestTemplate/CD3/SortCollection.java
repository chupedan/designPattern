package CuoiKy.TestTemplate.CD3;

import java.util.Comparator;
import java.util.List;

public abstract class SortCollection<T> {
    protected abstract int myCompare(T t1, T t2);
    public void sort(List<T> ls) {
        ls.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return myCompare(o1, o2);
            }
        });
    }
}
