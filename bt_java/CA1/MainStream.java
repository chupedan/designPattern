package bt_java.CA1;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        MyDataAccess myDataAccess = new MyDataAccess(stream);
        MyClient client = new MyClient(stream);
        myDataAccess.add(new MonHoc("003", "The duc", 1));
    }
}
