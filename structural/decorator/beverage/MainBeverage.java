package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend("Cà phê Trung Nguyên House Blend");
        houseBlend = new Milk(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);

        System.out.println(houseBlend.getDescription());
        System.out.println("Giá: "+ houseBlend.cost());
    }
}
