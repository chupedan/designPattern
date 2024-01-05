package behavioral.observer.tigia;

public class MainTIGia {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia);
        System.out.println("Lan 1: ");
        tiGia.notifyTiGia((float)2.0);
        System.out.println("Lan 2: ");
        tiGia.notifyTiGia(-2);
        nhaDauTuA.huyDangKy();

    }
}
