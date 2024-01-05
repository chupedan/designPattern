package test.Coffee;

public abstract class CoffeeDecorator extends Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
