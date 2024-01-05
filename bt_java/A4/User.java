package bt_java.A4;

public class User {
    public User(String name) {
        this.name = name;
    }
    private String name;
    public void vote(Candidate c){
        Election election = Election.getInstance();
        election.vote(c, name);
    }
}
