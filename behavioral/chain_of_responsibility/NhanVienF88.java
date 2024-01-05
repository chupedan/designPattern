package behavioral.chain_of_responsibility;

public class NhanVienF88 implements IXuLyKhoanVay{
    IXuLyKhoanVay capCaoHon; // theo so do mau
    String ten, chucVu;
    int hanMucVay;

    public NhanVienF88(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCapHon(IXuLyKhoanVay xuLyKhoanVay) {
        // tra ve ong cap cao hon
        capCaoHon = xuLyKhoanVay;
        return xuLyKhoanVay;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if (tienVay <= hanMucVay) {
            return chucVu + " " + ten + " xu ly khoan vay";
        } else {
            return capCaoHon.xuLyVay(tienVay);
        }
    }
}
