package bt_java.CA5;

// Subject
public class ATM {
    // Observer đã đăng ký với Subject
    I_RutTienATM taiKhoan;

    public void attach(I_RutTienATM taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void detach(I_RutTienATM taiKhoan) {
        if (this.taiKhoan == taiKhoan) //2 tai khoan giong nhau moi detach duoc
            taiKhoan = null;
    }

    private boolean kiemTraTienRut(int soTien) {
        if (taiKhoan.kiemTraSoDu(soTien) == true)
            return true;
        return false;
    }

    // dat private vi no chi phuc vu cho rutTien
    public void rutTien(int soTien) {
        if (taiKhoan != null) {
            if (kiemTraTienRut(soTien) == true) {
                taiKhoan.nhanThongBao(soTien, true);
            } else {
                taiKhoan.nhanThongBao(soTien, false);
            }
        } else {
            System.out.println("Khong co the trong may");
        }
    }

    public void nhanThongBao(int tienRut, boolean thanhCong) {

    }

    // thuc thi phuong cac phuong thuc cua Interface
    public static interface I_RutTienATM {
        boolean kiemTraSoDu(int tienRut);
        void nhanThongBao(int tienRut, boolean thanhCong);
    }
}
