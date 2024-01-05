package bt_java.CA5;

public class MainCA5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk = new TaiKhoan("An", 100, atm);
        tk.duaTheVaoATM();
        atm.rutTien(40);
    }
}
