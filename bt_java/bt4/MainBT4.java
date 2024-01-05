package bt_java.bt4;

public class MainBT4 {
    public static void main(String[] args) {
        ChuyenXe cx1 = new ChuyenXeNoiThanh("1", "Teo", 666, 9.9, "NT-SG", 999);
        ChuyenXe cx2 = new ChuyenXeNoiThanh("2", "Teoe", 668, 10.9, "NT-HN", 10.1);
        ChuyenXe cx3 = new ChuyenXeNoiThanh("3", "Teoo", 777, 11.9, "HN-SG", 99.1);
        ChuyenXe cx4 = new ChuyenXeNgoaiThanh("5", "Tioo", 977, 20.1, "Vung Tau", 3.3);
        ChuyenXe cx5 = new ChuyenXeNgoaiThanh("6", "Tooo", 877, 19, "Vung Tau", 4.5);
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        quanLyChuyenXe.them(cx1);
        quanLyChuyenXe.them(cx2);
        quanLyChuyenXe.them(cx3);
        quanLyChuyenXe.them(cx4);
        quanLyChuyenXe.them(cx5);
        quanLyChuyenXe.inDS();
        System.out.println("doanh thu xe noi thanh: " + quanLyChuyenXe.doanhThuXeNoiThanh());
        System.out.println("doanh thu xe ngoai thanh: " + quanLyChuyenXe.doanhThuXeNgoaiThanh());
        System.out.println("doanh thu 2 loai xe " + (quanLyChuyenXe.doanhThuXeNgoaiThanh() + quanLyChuyenXe.doanhThuXeNoiThanh()));

    }
}
