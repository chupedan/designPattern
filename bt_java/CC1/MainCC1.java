package bt_java.CC1;

public class MainCC1 {
    public static void main(String[] args) {
        Context tinh1 = new Context();
        Context tinh2 = new Context();
        Tinh cong = new Cong();
        Tinh tru = new Tru();
        Tinh nhan = new Nhan();
        Tinh chia = new Chia();
        tinh1.setTinhToan(tru);
        tinh2.setTinhToan(chia);
        System.out.println(tinh1.tinh(1, 2));
        System.out.println(tinh2.tinh(1, 2));

    }
}
