package CuoiKy.TestChain.CB2;

public class Main {
    public static void main(String[] args) {
        IXuLyKhoanVay giamDoc = new GiamDoc("Giam doc", 1000000);
        IXuLyKhoanVay thuKy = new NhanVien("Thu", "Thu Ky", 800000);
        IXuLyKhoanVay nhanVien = new NhanVien("An", "Nhan vien", 500000);
        IXuLyKhoanVay baoVe = new NhanVien("Bao", "Bao ve", 200000);

        baoVe.capKeTiep(nhanVien)
                .capKeTiep(thuKy)
                .capKeTiep(giamDoc);
        System.out.println("Vay" + baoVe.xuLyVay(250000));
    }
}
