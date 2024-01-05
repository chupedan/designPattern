package bt_java.CA2;

import bt_java.CA6.DashBoard;
import bt_java.CA6.PlayerData;

public class Main {
    public static void main(String[] args) {
        PlayerData nhanVat = new PlayerData(3, 200, 10);
        DashBoard d = new DashBoard(nhanVat);
        nhanVat.setCountDown(10);
    }
}
