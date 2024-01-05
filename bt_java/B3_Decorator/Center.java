package bt_java.B3_Decorator;

public class Center extends WidgetDecorator{

    public Center(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<center>");
        System.out.print("\t");
        child.show();
        System.out.println("</>");
    }
}
