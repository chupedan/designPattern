package bt_java.A4;

import creational.singleton.MySingleton;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int trump, biden; // tăng biến đếm
    private List<String> votedUsers = new ArrayList<>();

    public int getTrump() {
        return trump;
    }

    public int getBiden() {
        return biden;
    }

    public static Election getInstance() {
        if (instance == null)
            instance = new Election();
        return instance;
    }

    public void vote(Candidate c, String name) {
        for (String n : votedUsers) {
            if (n.equals(name)) return;
        }
        if (c == Candidate.TRUMP) trump++;
        else biden++;
        votedUsers.add(name);
    }
}
