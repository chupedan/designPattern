package test.De2;

public class Main {
    public static void main(String[] args) {
        QuanLyChung company = new GroupEmail("ABC");
        QuanLyChung mem1 = new ProfileMember("an13@gmail.com", "an", "113", "a3");
        QuanLyChung mem2 = new ProfileMember("bao1@gmail.com", "bao", "113", "a3");

        company.add(mem1);
        company.add(mem2);

        System.out.println(company.getEmailAddress());
        System.out.println(company.getInfo());
    }
}
