package bt_java.A4;

import static bt_java.A4.Candidate.BIDEN;
import static bt_java.A4.Candidate.TRUMP;

public class MainA4 {
    public static void main(String[] args) {
        Election election = Election.getInstance();
        User u1 = new User("vu");
        User u2 = new User("vum");
        User u3 = new User("vumn");

        u1.vote(Candidate.TRUMP);
        u1.vote(Candidate.TRUMP);
        u2.vote(Candidate.TRUMP);
        u3.vote(Candidate.BIDEN);

        System.out.println("Số vote của Trump: "+election.getTrump());
        System.out.println("Số vote của Biden: "+election.getBiden());
    }
}
