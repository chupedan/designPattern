package bt_java.CC3;

public class Main {
    public static void main(String[] args) {
        GioHang gh = new GioHang();

        gh.setKhuyenMai(new KhuyenMai10Max100());
        gh.thanhToan();
    }
}
