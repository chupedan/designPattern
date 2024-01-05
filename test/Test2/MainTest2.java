package test.Test2;

public class MainTest2 {
    public static void main(String[] args) {
        MailClient mc = new MailClient.Builder().addCTTV("an", "113", "A3", "an@1.com")
                .build();
        System.out.println(mc.toString());
    }
}
