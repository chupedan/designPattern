package bt_java.A6;

import creational.singleton.MySingleton;
import creational.singleton.SanPham;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccess {
    private static Dictionary<String ,DataAccess> dataAccessObject = new Hashtable<>();

    //List<SanPham> li = new ArrayList<>();
//    public static DataAccess getInstance() {
//        if (instance == null)
//            instance = new DataAccess();
//        return instance;
//    }
    public static DataAccess getInstance(String tag) {
        if (dataAccessObject.get(tag) == null) {
            DataAccess d = new DataAccess();
            dataAccessObject.put(tag, d);
        }
        return dataAccessObject.get(tag);
    }
    public void add(SanPham s) {

    }
    public void update(SanPham s) {

    }
}
