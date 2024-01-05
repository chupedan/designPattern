package CuoiKy.TestChain.CB2;

public class NhanVien implements IXuLyKhoanVay{
    String ten, chucVu;
    int hanMucVay;
    IXuLyKhoanVay bacKeTiep;

    public NhanVien(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
        this.chucVu = chucVu;
    }

    @Override
    public IXuLyKhoanVay capKeTiep(IXuLyKhoanVay keTiep) {
        return bacKeTiep = keTiep;
    }

    @Override
    public String xuLyVay(int soTien) {
        if (soTien <= hanMucVay) {
            return chucVu + " " + ten + " xu ly khoan vay";
        }
        return bacKeTiep.xuLyVay(soTien);
    }
}
