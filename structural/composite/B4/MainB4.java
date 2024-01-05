package structural.composite.B4;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachHocTap khoaHoc = new KeHoachChung("Khoa 63");

        KeHoachHocTap nam1 = new KeHoachChung("nam 1");
        KeHoachHocTap nam2 = new KeHoachChung("nam 2");

        KeHoachHocTap ki1 = new KeHoachChung("ki 1");
        KeHoachHocTap ki2 = new KeHoachChung("ki 2");
        KeHoachHocTap ki3 = new KeHoachChung("ki 3");
        KeHoachHocTap ki4 = new KeHoachChung("ki 4");

        KeHoachHocTap td = new MonHoc("The duc", 400, 1);
        KeHoachHocTap nhapMon = new MonHoc("Nhap mon", 800, 4);
        KeHoachHocTap thcs = new MonHoc("Tin hoc co so", 800, 4);
        KeHoachHocTap tthcm = new MonHoc("Tu tuong Ho Cho Minh", 800, 4);
        KeHoachHocTap triet = new MonHoc("Triet", 800, 4);
        KeHoachHocTap toan = new MonHoc("Toan", 800, 4);
        KeHoachHocTap van = new MonHoc("Van", 800, 4);
        KeHoachHocTap anh = new MonHoc("Anh", 800, 4);
        khoaHoc.add (nam1);
        khoaHoc.add(nam2);

        nam1.add(ki1);
        nam1.add(ki2);
        nam2.add(ki3);
        nam2.add(ki4);

        ki1.add(td);
        ki1.add(nhapMon);
        ki2.add(thcs);
        ki3.add(tthcm);
        ki3.add(toan);
        ki3.add(van);
        ki3.add(anh);
        ki4.add(triet);

        System.out.println("Nam 1: " + "\n\tTong so tin chi: " + nam1.getTinChi() + "\n\tTong hoc phi: " + nam1.getHocPhi());
        System.out.println("Nam 2: " + "\n\tTong so tin chi: " + nam2.getTinChi() + "\n\tTong hoc phi: " + nam2.getHocPhi());
        System.out.println("Tong cong: " + "\n\tTong so tin chi: " + khoaHoc.getTinChi() + "\n\tTong hoc phi: " + khoaHoc.getHocPhi());
    }
}
