package bt_java.B2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static void inKQ(String[] kq) {
        Arrays.stream(kq).forEach(s -> {
            System.out.print(s + "\n");
        });
        System.out.println();
    }
    public static void main(String[] args) {
        ITokennize tachTu = new TachTu("Hom nay troi mua qua, lop duoc nghi hoc va hom sau hoc bu!");
//        inKQ(tachTu.tokennize());
        ITokennize boDauCau = new LoaiBoDauCau(tachTu);
        System.out.println("Loai bo dau cau: ");
//        inKQ(boDauCau.tokennize());
        ITokennize boTuDung = new LoaiBoTuDung(boDauCau);
        inKQ(boTuDung.tokennize());
    }
}
