package test.B4;

public class Main {
    public static void main(String[] args) {
        KeHoachHocTap khoa = new KeHoachChung("Khoa 63");

        KeHoachHocTap nam1 = new KeHoachChung("Nam 1");
        KeHoachHocTap nam2 = new KeHoachChung("Nam 2");

        KeHoachHocTap ki1 = new KeHoachChung("Ki 1");
        KeHoachHocTap ki2 = new KeHoachChung("Ki 2");
        KeHoachHocTap ki3 = new KeHoachChung("Ki 3");
        KeHoachHocTap ki4 = new KeHoachChung("Ki 4");

        KeHoachHocTap toan1 = new MonHoc("Toan1", 4, 400);
        KeHoachHocTap toan2 = new MonHoc("Toan2", 4, 400);
        KeHoachHocTap triet = new MonHoc("Triet", 4, 300);
        KeHoachHocTap anh = new MonHoc("Anh", 4, 350);
        KeHoachHocTap td = new MonHoc("The duc", 1, 100);

        khoa.add(nam1);
        khoa.add(nam2);

        nam1.add(ki1);
        nam1.add(ki2);
        nam2.add(ki3);
        nam2.add(ki4);

        ki1.add(toan1);
        ki1.add(toan2);

        ki2.add(triet);
        ki3.add(anh);
        ki4.add(td);

        System.out.println("Nam 1: " + "\n\tTong so tin chi: " + nam1.getTinChi() + "\n\tTong hoc phi: " + nam1.getHocPhi());
        System.out.println("Nam 2: " + "\n\tTong so tin chi: " + nam2.getTinChi() + "\n\tTong hoc phi: " + nam2.getHocPhi());
    }



}
