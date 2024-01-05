package bt_java.VdFactory.Vietnam_Pizza;

import bt_java.VdFactory.Pizza;
import bt_java.VdFactory.PizzaStore;
import bt_java.VdFactory.PizzaType;

public class VietNamPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case HAI_SAN -> {
                return new PizzaHaiSanVN();
            }
        }
        return null;
    }
}
