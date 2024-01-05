package test.Test2Composite;

public class MainTest2 {
    public static void main(String[] args) {
        QuanLyChung company = new EmailGroup("ABC");
        QuanLyChung mem1 = new MemberProfile("tri12@gmail.com", "tri", "113", "a3");
        QuanLyChung mem2 = new MemberProfile("an13@gmail.com", "an", "113", "a3");

        company.add(mem1);
        company.add(mem2);

        System.out.println(company.getEmailAddress());
        System.out.println(company.getInfo());
    }
}
