package bt_java.VdFactory;

import bt_java.VdFactory.Vietnam_Pizza.VietNamPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore vnPizzaStore = new VietNamPizzaStore();
        Pizza p1 = vnPizzaStore.oderPizza(PizzaType.HAI_SAN);
        System.out.println(p1.toString());
    }
}
