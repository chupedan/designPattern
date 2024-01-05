package behavioral.stratery.duck_example;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("Em là vịt nhưng biết bơi ếch");
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performFly() {
        System.out.println(flyBehavior.fly());
    }

    void performQuack() {
        System.out.println(quackBehavior.quack());
    }


}
