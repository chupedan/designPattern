package test.Test2Composite;

import java.util.ArrayList;
import java.util.List;

public class EmailGroup extends QuanLyChung{
    String groupName;
    List<QuanLyChung> li = new ArrayList<>();


    public EmailGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void add(QuanLyChung qlc) {
        li.add(qlc);
    }

    @Override
    public void remove(QuanLyChung qlc) {
        li.remove(qlc);
    }

    @Override
    public String getEmailAddress() {
        String emailAddresses = "";
        for (QuanLyChung member : li) {
            emailAddresses += member.getEmailAddress() + ", ";
        }
        return emailAddresses;
    }

    @Override
    public String getInfo() {
        return "Group name: " + groupName;
    }
}
