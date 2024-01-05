package test.De2;

import java.util.ArrayList;
import java.util.List;

public class GroupEmail extends QuanLyChung{
    String groupName;

    public GroupEmail(String groupName) {
        this.groupName = groupName;
    }

    List<QuanLyChung> li = new ArrayList<>();

    @Override
    public void add(QuanLyChung mem) {
        li.add(mem);
    }

    @Override
    public void remove(QuanLyChung mem) {
        li.remove(mem);
    }

    @Override
    public String getEmailAddress() {
        String emailAddress = "";
        for (QuanLyChung mem : li) {
            emailAddress += mem.getEmailAddress() + ", ";
        }
        return emailAddress;
    }

    @Override
    public String getInfo() {
        String info = "";

        for (QuanLyChung mem : li) {
            info += mem.getInfo() + ", ";
        }
        return info;
    }
}
