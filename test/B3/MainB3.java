package test.B3;

import java.util.ArrayList;

public class MainB3 {
    public static void main(String[] args) {
        // Tạo thư mục gốc
        ToChucFile thuMucGoc = new ThuMuc("D", "2023-10-25");

        // Tạo thư mục con
        ToChucFile taiLieu = new ThuMuc("TaiLieu", "2023-10-25");

        ToChucFile designPattern = new ThuMuc("Design Pattern", "2023-10-25");


        // Thêm thư mục con vào thư mục gốc
        thuMucGoc.addItem(taiLieu);
        taiLieu.addItem(designPattern);

        // Tạo một tệp trong thư mục gốc
        ToChucFile file1 = new File("CreationalPattern.pptx", "2023-10-25");
        ToChucFile file2 = new File("StructuralPattern.pptx", "2023-10-25");

        designPattern.addItem(file1);
        designPattern.addItem(file2);

        // Lấy đường dẫn của tệp 1
        System.out.println("Đường dẫn của CreationalPattern.pptx: " + taiLieu.getPath());
        System.out.println();
        System.out.println("Đường dẫn của CreationalPattern.pptx: " + taiLieu.getStringTreeFolder());
    }
}
