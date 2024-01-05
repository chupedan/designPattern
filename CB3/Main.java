package bt_java.CB3;

public class Main {
    public static void main(String[] args) {
        TinhTienDienBacThang b1 = new TinhDienTheoBac(0, 50, 1_806);
        TinhTienDienBacThang b2 = new TinhDienTheoBac(50, 100, 1_866);
        TinhTienDienBacThang b3 = new TinhDienTheoBac(100, 200, 2_167);
        TinhTienDienBacThang b4 = new TinhDienTheoBac(200, 300, 2_729);
        TinhTienDienBacThang b5 = new TinhDienTheoBac(300, 400, 3_051);
        TinhTienDienBacThang b6 = new TinhDienTheoBac(400, Integer.MAX_VALUE, 3_151);

        b1.bacKeTiep(b2)
                .bacKeTiep(b3)
                .bacKeTiep(b4)
                .bacKeTiep(b5)
                .bacKeTiep(b6);
        System.out.println("Tien dien: " + b1.tinhTienDien(175));

    }
}
