package CuoiKy.TestObserver.CA6;

public class PlayerData {
    int countDown, time, grade;

    public PlayerData(int countDown, int time, int grade) {
        this.countDown = countDown;
        this.time = time;
        this.grade = grade;
    }

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
