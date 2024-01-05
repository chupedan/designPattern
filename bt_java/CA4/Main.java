package bt_java.CA4;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA tva = new ThanhVienA(topic);
        ThanhVienB tvb = new ThanhVienB(topic);
        topic.taoTinMoi(new TinTuc(1, "Co giao Tuyen Quang"));
        topic.taoTinMoi(new TinTuc(2, "Dong dat song than"));
    }
}
