package CuoiKy.TestTemplate.CD3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> ls = new ArrayList<>();
        ls.add(new Product("Banh", 2, 10000));
        ls.add(new Product("Ruou", 2, 90000));

        ls.add(new Product("Nuoc", 2, 30000));
        //SortCollection<Product> sortCollection = new SortByName();
        SortCollection<Product> sortCollection = new SortByPrice();

        sortCollection.sort(ls);
        for (Product p : ls) {
            System.out.println(p);
        }
    }
}
