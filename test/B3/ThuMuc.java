package test.B3;

import java.util.ArrayList;
import java.util.List;

public class ThuMuc extends ToChucFile{
    List<ToChucFile> dsThuMuc;

    public ThuMuc(String ten, String ngayTao) {
        super(ten, ngayTao);
        dsThuMuc = new ArrayList<>();
    }

    @Override
    public void addItem(ToChucFile tc) {
        dsThuMuc.add(tc);
    }

    @Override
    public void removeItem(ToChucFile tc) {
        dsThuMuc.remove(tc);
    }

    @Override
    public String getStringTreeFolder() {
        String tree = "Thu muc: " + this.ten + "\n";
        for (ToChucFile tc : dsThuMuc) {
            tree += "  + " + tc.getStringTreeFolder() + "\n";
        }
        return tree;
    }

    @Override
    public String getPath() {
        if (ten != null) {
            if (dsThuMuc != null && !dsThuMuc.isEmpty()) {
                String parentPath = dsThuMuc.get(0).getPath(); // Lấy đường dẫn của thư mục con đầu tiên
                return parentPath + "/" ;
            } else {
                return "/" + ten; // Đây có thể là thư mục gốc
            }
        }
        return null; // Trả về null nếu tên thư mục là null
    }

}
