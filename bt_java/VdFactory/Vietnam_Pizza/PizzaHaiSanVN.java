package bt_java.VdFactory.Vietnam_Pizza;

import bt_java.VdFactory.Pizza;

public class PizzaHaiSanVN extends Pizza {

    @Override
    public void prepare() {
        description.append("Chuẩn bị: 4 con cá cơm\n");
    }

    @Override
    public void bake() {
        description.append("Nướng trên lửa than 20ph\n");
    }

    @Override
    public void cut() {
        description.append("Cắt làm 4 miếng\n");
    }

    @Override
    public void box() {
        description.append("Đóng hợp\nChúc ngon miệng\n");
    }
}
