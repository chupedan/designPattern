package bt_java.CD3;

import java.util.ArrayList;
import java.util.List;

public class MainSortCollection {
    public static void main(String[] args) {
        // 1. tao 1 SortCollection
        SortCollection sortCollection= new SortProductByName();
        List<Product> lsProduct = new ArrayList<>();
        // 2. tao 1 list product
        Product p1 = new Product("do an", 10000, 2);
        Product p2 = new Product("nuoc uong", 50000, 2);
        Product p3 = new Product("an vat", 30000, 3);
        // 3. su dung SortCollection de sap xep
        lsProduct.add(p1);
        lsProduct.add(p2);
        lsProduct.add(p3);

        sortCollection.sort(lsProduct);
        // 4. in ra man hinh de kiem tra
        for (Product p : lsProduct) {
            System.out.println(p.toString());
        }
    }
}
