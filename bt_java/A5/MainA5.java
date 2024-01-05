package bt_java.A5;

public class MainA5 {
    public static void main(String[] args) {
        Sach sach = new Sach.Builder()
                .setTuaDe("ok")
                .setSoTrang(101)
                .setTacGia("tri")
                .addDsChuong("chuong 1")
                .addDsChuong("chuong 2")
                .build();
        System.out.println(sach.toString());
    }
}
