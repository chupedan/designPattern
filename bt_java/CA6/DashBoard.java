package bt_java.CA6;

public class DashBoard implements IPlayerData{
    PlayerData playerData;

    public DashBoard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.addDashBoard(this);
    }

    @Override
    public void update(int time, int countDown, int grade) {
        System.out.println("PlayerData{" +
                "time=" + time +
                ", countDown=" + countDown +
                ", grade=" + grade +
                '}');
    }
}
