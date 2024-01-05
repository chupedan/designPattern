package test.BieuThuc;

import structural.decorator.bieuthuc.BieuThuc;
import structural.decorator.bieuthuc.BieuThucDonGian;
import structural.decorator.bieuthuc.Cong;

public class Main {
    public static void main(String[] args) {
        BieuThuc bt1 = new BieuThucDonGian(5);
        BieuThuc bt2 = new Cong(new Cong(new BieuThucDonGian(5), 5), 5);
        System.out.println(bt2.bieuThuc());
    }
}
