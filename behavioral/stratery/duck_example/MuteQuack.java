package behavioral.stratery.duck_example;

public class MuteQuack implements IQuackBehavior{
    @Override
    public String quack() {
        return "Em bị câm";
    }
}
