package behavioral.chain_of_responsibility;

public class GiamDocF88  implements IXuLyKhoanVay{
    String ten;
    int hanMucVay;

    public GiamDocF88(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCapHon(IXuLyKhoanVay iXuLyKhoanVay) {
        return null;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if (tienVay <= hanMucVay) {
            return "Giam doc " + ten + " xu ly khoan vay";
        } else {
            return "Ra ngan hang vay";
        }
    }
}
