package CuoiKy.TestIteraator.Array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    static String[] dsHocSinh = {"An", "Bao", "Dat", "Linh", "Vu"};
    public static void inDs(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Iterator<String> dsHS = Arrays.asList(dsHocSinh).iterator();
        inDs(dsHS);
    }
}
