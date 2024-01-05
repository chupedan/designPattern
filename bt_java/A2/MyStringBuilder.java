package bt_java.A2;

import creational.builder.bt1.HoaDon;

public class MyStringBuilder {
    private String s = "";

    public MyStringBuilder addString(String sub) {
        s += sub;
        return this;
    }
    public MyStringBuilder addFloat(float f) {
        s += f;
        return this;
    }
    public MyStringBuilder addBool(boolean b) {
        s += b;
        return this;
    }

    @Override
    public String toString() {
        return s;
    }

}
