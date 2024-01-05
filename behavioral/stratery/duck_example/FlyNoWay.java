package behavioral.stratery.duck_example;

public class FlyNoWay implements IFlyBehavior{
    @Override
    public String fly() {
        return "Em khum biết bay";
    }
}
