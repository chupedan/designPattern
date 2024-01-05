package bt_java.B3_Decorator;

public class Text extends Widget{
    String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
