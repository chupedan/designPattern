package test.B3;

public abstract class ToChucFile {
    String ten, ngayTao;

    public ToChucFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    public abstract void addItem(ToChucFile tc);
    public abstract void removeItem(ToChucFile tc);
    public abstract String getStringTreeFolder();
    public abstract String getPath();

}
