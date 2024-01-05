package structural.decorator.bieuthuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bieuThucDonGian = new BieuThucDonGian(5);
        BieuThuc bieuThucDonGian2 = new Cong(new Cong(new BieuThucDonGian(5), 5), 5);

        System.out.println(bieuThucDonGian2.giaTri());

    }
}
