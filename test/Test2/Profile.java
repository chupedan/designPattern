package test.Test2;

public class Profile {

    String ten, sdt, phongBan, email;

    public Profile(String ten, String sdt, String phongBan, String email) {
        this.ten = ten;
        this.sdt = sdt;
        this.phongBan = phongBan;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "ten='" + ten + '\'' +
                ", sdt='" + sdt + '\'' +
                ", phongBan='" + phongBan + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
