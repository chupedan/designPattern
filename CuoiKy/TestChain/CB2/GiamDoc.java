package CuoiKy.TestChain.CB2;

public class GiamDoc implements IXuLyKhoanVay{
    String ten;
    int hanMucVay;

    public GiamDoc(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capKeTiep(IXuLyKhoanVay keTiep) {
        return null;
    }

    @Override
    public String xuLyVay(int soTien) {
        if (soTien <= hanMucVay) {
            return "Giam doc" + ten + "xu ly khoan vay";
        }
        return "Ra ngan hang vay";
    }
}
