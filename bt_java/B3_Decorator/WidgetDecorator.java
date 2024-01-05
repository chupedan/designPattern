package bt_java.B3_Decorator;

public abstract class WidgetDecorator extends Widget{
    Widget child;

    public WidgetDecorator(Widget child) {
        this.child = child;
    }
}
