package bt_java.B3_Decorator;

public class RadioButton extends WidgetDecorator{
    public RadioButton(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<RadioButton>");
        System.out.print("\t");
        child.show();
        System.out.println("</>");
    }
}
