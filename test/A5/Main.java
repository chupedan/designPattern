package test.A5;

public class Main {
    public static void main(String[] args) {
        Sach sach1 = new Sach.Builder().addTuaDe("Di 1 ngay dang hoc 1 sang khon")
                .addTacGia("To Huu")
                .addSoTrang(10)
                .addChuong("Chuong1: Co be lo lem")
                .addChuong("Chuong2: Co be quang khan do")
                .builder();
        System.out.println(sach1.toString());
    }
}
