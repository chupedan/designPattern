package test.Test2;

import java.util.ArrayList;

public class MailClient {
    private ArrayList<Profile> ctTVs;

    @Override
    public String toString() {
        return "MailClient{" +
                "ctTVs=" + ctTVs +
                '}';
    }

    public MailClient(Builder b) {
        this.ctTVs = b.ctTVs;
    }

    public static class Builder {
        private ArrayList<Profile> ctTVs = new ArrayList<>();

        public Builder addCTTV(String ten, String sdt, String phongBan, String email) {
            ctTVs.add(new Profile(ten, sdt, phongBan, email));
            return this;
        }
        public MailClient build() {
            return new MailClient(this);
        }
    }
}
