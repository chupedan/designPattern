package test.Coffee;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 5;
    }
}
