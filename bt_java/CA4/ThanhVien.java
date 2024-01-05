package bt_java.CA4;

public abstract class ThanhVien implements Topic.topicObserver {
    Topic topic;
    public ThanhVien(Topic topic) {
        this.topic = topic;
        topic.themObserver(this);

    }
    public void dangKy() {
        topic.themObserver(this);
    }
    public void huyDK() {
        topic.xoaObserver(this);
    }
}
