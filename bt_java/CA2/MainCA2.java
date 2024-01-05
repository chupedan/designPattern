package bt_java.CA2;

public class MainCA2 {
    public static void main(String[] args) {
        MyButton myButton = new MyButton();
        Activity activity = new Activity(myButton);
        myButton.click();
        myButton.click();
    }
}
