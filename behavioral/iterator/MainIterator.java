package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        Iterator iterators = li.iterator();
        while (iterators.hasNext()) {
            System.out.println(iterators.next());
        }
        //
        System.out.println("My Iterator");
        ArrayCollection63 collection63 = new ArrayCollection63();
        Iterator63 iterator63 = collection63.createIterator();
        while (!iterator63.isDone()) {
            System.out.println(iterator63.next());
        }
    }
}
