package bt_java.B3_Decorator;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("chao");
        Widget center = new Center(text);
        Widget btn = new Button(center);
        btn.show();
    }
}
