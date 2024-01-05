package bt_java.CA1;

import java.util.List;

public class MyClient implements MyStream.MyStreamListener<List<MonHoc>> {
    int count = 0;
    public MyClient(MyStream<List<MonHoc>> myStream) {
        myStream.addListen(this);
    }
    @Override
    public void listen(List<MonHoc> monHocs) {
        // in ds mon hoc ra man hinh
        System.out.println(++count);

        monHocs.stream().forEach(monHoc -> {
            System.out.println(monHoc.toString());
        });
    }
}
