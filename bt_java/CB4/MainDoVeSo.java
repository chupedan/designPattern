package bt_java.CB4;

public class MainDoVeSo {
    public static void main(String[] args) {

        IDoVeSo giaiUt = new GiaiUt("Giai Bay", new String[] {"86", "35", "84", "68"});
        IDoVeSo giaiSau = new GiaiThuong("Giai Sau", new String[] {"794", "879", "397"});
        IDoVeSo giaiNam = new GiaiThuong("Giai Nam", new String[] {"1293", "3744", "8119", "9435", "2535", "9742"});
        IDoVeSo giaiTu = new GiaiThuong("Giai Tu", new String[] {"6459", "0224", "5895", "5108"});
        IDoVeSo giaiBa = new GiaiThuong("Giai Ba", new String[] {"08047", "50255", "63076", "61617", "76879", "27383"});
        IDoVeSo giaiHai = new GiaiThuong("Giai Hai", new String[] {"97683", "99909"});
        IDoVeSo giaiNhat = new GiaiThuong("Giai Nhat", new String[] {"36972"});
        IDoVeSo giaiDB = new GiaiThuong("Giai Dac Biet", new String[] {"40620"});

        giaiDB.giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiHai)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiNam)
                .giaiKeTiep(giaiSau)
                .giaiKeTiep(giaiUt);


        System.out.println(giaiDB.doVeSo("15108"));
        System.out.println(giaiDB.doVeSo(""));
    }
}
