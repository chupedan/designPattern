package test.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee ly1 = new DefaultCoffee();
        ly1 = new Milk(ly1);

        System.out.println(ly1.getPrice());
    }
}
