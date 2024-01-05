package test.Test2Composite;

import java.util.ArrayList;
import java.util.List;

public class MemberProfile extends QuanLyChung{
    String ten, sdt, phongBan, email;
    public MemberProfile(String email, String ten, String sdt, String phongBan) {
        this.email = email;
        this.ten = ten;
        this.sdt = sdt;
        this.phongBan = phongBan;
    }

    @Override
    public void add(QuanLyChung qlc) {
    }

    @Override
    public void remove(QuanLyChung qlc) {
    }

    @Override
    public String getEmailAddress() {
        return email;
    }

    @Override
    public String getInfo() {
        return "MemberProfile{" +
                "ten='" + ten + '\'' +
                ", sdt='" + sdt + '\'' +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
