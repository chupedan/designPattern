package structural.decorator.beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 6 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Đậu nành";
    }
}
