package bt_java.CA2;

public class MyButton {
    OnCLickListener activity;

    public void attach(OnCLickListener activity) {
        this.activity = activity;
    }
    public void detach() {
        this.activity = null;
    }

    public void click() {
        if (activity != null) {
            this.activity.onClick();
        }
    }
    public static interface OnCLickListener {
        public void onClick();
    }
}
