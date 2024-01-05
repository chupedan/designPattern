package bt_java.VdFactory;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType type);
    public Pizza oderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
