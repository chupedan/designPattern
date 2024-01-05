package CuoiKy.TestChain.CB4;

public class Main {
    public static void main(String[] args) {
        IDoVeSo giaiUt = new GiaiUt("Giai ut", new String[] {"86", "35", "84", "68"});
        IDoVeSo giaiTu = new GiaiThuong("Giai Tu", new String[] {"123", "234", "456", "678"});
        IDoVeSo giaiBa = new GiaiThuong("Giai Ba", new String[] {"2345", "4567", "6653", "9867"});
        IDoVeSo giaiNhi = new GiaiThuong("Giai Nhi", new String[] {"65431", "98734", "09781", "71587"});
        IDoVeSo giaiNhat = new GiaiThuong("Giai Nhat", new String[] {"71537", "46971", "35681", "06983"});

        giaiNhat.giaiKeTiep(giaiNhi)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiUt);
        System.out.println(giaiNhat.doVeSo("16653"));
    }
}
