package bt_java.CA2;

public class Activity implements MyButton.OnCLickListener{
    MyButton btn;
    int count = 0;

    public Activity(MyButton btn) {
        this.btn = btn;
        btn.attach(this);
    }

    @Override
    public void onClick() {
        count++;
        System.out.println("Ban da click lan thu: " + count);
    }
}
