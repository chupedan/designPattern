package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
    // thay tên biến component bằng beverage cho dễ hiểu
    // về bản chấ beverage ở lớp con chính là component
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription(); //
    }
}
