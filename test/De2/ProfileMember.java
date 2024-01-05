package test.De2;

public class ProfileMember extends QuanLyChung{
    String ten, sdt, phongBan, email;

    public ProfileMember(String email, String ten, String sdt, String phongBan) {
        this.ten = ten;
        this.sdt = sdt;
        this.phongBan = phongBan;
        this.email = email;
    }

    @Override
    public void add(QuanLyChung mem) {

    }

    @Override
    public void remove(QuanLyChung mem) {

    }

    @Override
    public String getEmailAddress() {
        return email;
    }

    @Override
    public String getInfo() {
        return "Ten: " + ten + ", Sdt: " + sdt + ", Phong ban: " + phongBan;
    }
}
