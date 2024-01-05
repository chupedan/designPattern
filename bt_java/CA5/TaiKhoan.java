package bt_java.CA5;

public class TaiKhoan implements ATM.I_RutTienATM{
    ATM atm;
    String name;
    int soDu;

    public TaiKhoan(String name, int soDu, ATM atm) {
        this.name = name;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM() {
        atm.attach(this);
    }

    public void rutTheKhoiATM() {
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int tienRut) {
        if (soDu - 50 >= tienRut) {
            return true;
        }
        return false;
    }

    @Override
    public void nhanThongBao(int tienRut, boolean thanhCong) {
        if (thanhCong == true) {
            soDu -= tienRut;
            System.out.println(name + " da rut: " + tienRut);
            System.out.println("Trong tai khoan con: " + soDu);
        } else {
            System.out.println("Ban khong du tien");
        }
    }
}
