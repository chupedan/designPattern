package structural.decorator.beverage;

public abstract class Beverage {
    String description;
    public abstract int cost(); // phuong thuc truu tuong

    public String getDescription() {
        return description;
    }
}
