package bt_java.B3_Decorator;

public class Icon extends WidgetDecorator{
    public Icon(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<i>");
        System.out.print("\t");
        child.show();
        System.out.println("</>");
    }
}
