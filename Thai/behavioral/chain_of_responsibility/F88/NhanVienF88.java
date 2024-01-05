package behavioral.chain_of_responsibility.F88;

public class NhanVienF88 implements IXulyKhoanVay{
    IXulyKhoanVay capCaoHon;
    String ten,chucVu;
    int hanMucVay;

    public NhanVienF88(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXulyKhoanVay capCaoHon(IXulyKhoanVay xulyKhoanVay) {
        capCaoHon=xulyKhoanVay;
        return xulyKhoanVay;
    }

    @Override
    public String xuLyVay(int tienvay) {
        if(tienvay<=hanMucVay)
            return "Nhân viên: "+ten+"| chức vụ: "+chucVu+"| Xử lý khoản vay";
        else
            return capCaoHon.xuLyVay(tienvay);
    }
}
