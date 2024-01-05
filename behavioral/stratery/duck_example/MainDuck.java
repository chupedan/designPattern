package behavioral.stratery.duck_example;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
//        duck.setFlyBehavior(new FlyWithWing());
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.display();
    }
}
