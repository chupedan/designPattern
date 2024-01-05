package bt_java.A3;

public class Circle extends Shape{
    private static Circle myCircle;
    public static Circle getInstance() {
        if (myCircle == null) {
            myCircle = new Circle();
        }
        return myCircle;
    }
    @Override
    public String draw() {
        return null;
    }
}
