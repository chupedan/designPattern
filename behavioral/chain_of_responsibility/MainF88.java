package behavioral.chain_of_responsibility;

public class MainF88 {
    public static void main(String[] args) {
        IXuLyKhoanVay gacCong = new NhanVienF88("Tuy", "Gac cong", 10000);
        IXuLyKhoanVay giuXe = new NhanVienF88("Anh Tuan", "Giu xe", 10000);
        IXuLyKhoanVay thuKy = new NhanVienF88("Dieu Thuyen", "Thu Ky", 10000);
        IXuLyKhoanVay truongPhong = new NhanVienF88("Tao thao", "Truong phong", 30000);
        IXuLyKhoanVay giamDoc = new GiamDocF88("Luu Bi", 500000);
        gacCong.capCapHon(giuXe)
                .capCapHon(thuKy)
                .capCapHon(truongPhong)
                .capCapHon(giamDoc);
        System.out.println(gacCong.xuLyVay(2000000));
    }
}
