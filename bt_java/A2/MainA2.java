package bt_java.A2;

public class MainA2 {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder
                .addString("AAA")
                .addString("\n")
                .addFloat((float) 1.1)
                .addString("\n")
                .addBool(true);
        System.out.println(myStringBuilder.toString());
    }
}
