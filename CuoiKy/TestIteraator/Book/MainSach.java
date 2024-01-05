package CuoiKy.TestIteraator.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainSach {
    public static void inSach(Iterator<Sach> iterator) {
        while (iterator.hasNext()) {
            Sach s = iterator.next();
            System.out.println("Sach{" + '\n' + '\t' +
                    "tenSach=" + s.tenSach + '\n' + '\t' +
                    "tacGia=" + s.tacGia + '\n' + '\t' +
                    "gia=" + s.gia + '\n' + '\t' +
                    "soTrang=" + s.soTrang + '\n' + '\t' +
                    "namXB=" + s.namXB + '\n' +
                    '}');
        }
    }
    public static void main(String[] args) {
        List<Sach> ls = new ArrayList<>();
        ls.add(new Sach("Toan1", "ABC", 100000, 100, 1999));
        ls.add(new Sach("Triet", "TO Huong", 100000, 200, 1979));
        ls.add(new Sach("Tu Tuong HCM", "ABC", 100000, 400, 1989));
        ls.add(new Sach("The duc", "ABC", 100000, 300, 1996));
        Iterator<Sach> iterator = ls.iterator();
        inSach(iterator);
    }
}
