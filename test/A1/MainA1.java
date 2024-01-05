package test.A1;

public class MainA1 {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder().addHeader("ram11", "11/11/2000", "Van An")
                .addCTHD("ram", 10, 100000, 1.1).build();
        System.out.println(hd.toString());
    }
}
