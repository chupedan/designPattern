package bt_java.CA4;

// data class
public class TinTuc {
    int id;
    String noiDung;

    public TinTuc(int id, String noiDung) {
        this.id = id;
        this.noiDung = noiDung;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getId() {
        return id;
    }

    public String getNoiDung() {
        return noiDung;
    }
}
