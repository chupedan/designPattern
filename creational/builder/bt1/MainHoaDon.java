package creational.builder.bt1;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder().addHeader("123", "1/1/2222", "van a")
                                        .addCTHD("nuoc", 1, 10, 1).build();
        System.out.println(hd.toString());
    }
}
