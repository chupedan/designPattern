package structural.decorator.beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 7 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Kem";
    }
}
