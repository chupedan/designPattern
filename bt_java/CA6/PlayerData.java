package bt_java.CA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    public PlayerData(int time, int countDown, int grade) {
        this.time = time;
        this.countDown = countDown;
        this.grade = grade;
    }

    int time, countDown, grade;
    IPlayerData dashBoard;
    List<IPlayerData> listrners = new ArrayList<>();
    public void addListener(IPlayerData l) {
        listrners.add(l);
    }

    public void setTime(int time) {
        this.time = time;
        dashBoard.update(time, countDown, grade);
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        dashBoard.update(time, countDown, grade);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashBoard.update(time, countDown, grade);
    }
    public void addDashBoard(IPlayerData d) {
        dashBoard = d;
    }
}
