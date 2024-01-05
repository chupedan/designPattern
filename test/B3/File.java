package test.B3;

public class File extends ToChucFile{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void addItem(ToChucFile tc) {

    }

    @Override
    public void removeItem(ToChucFile tc) {

    }

    @Override
    public String getStringTreeFolder() {
        return ten;
    }

    @Override
    public String getPath() {
        return ten;
    }
}
