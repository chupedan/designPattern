package bt_java.B3_Decorator;

public class Button extends WidgetDecorator{
    public Button(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<Button>");
        System.out.print("\t");
        child.show();
        System.out.println("</>");
    }
}
