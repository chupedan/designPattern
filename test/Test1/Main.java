package test.Test1;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .addCpu("111")
                .addRam("16gb")
                .addScreen("144hz")
                .addStorage("32gb")
                .addGia(300000)
                .build();
        System.out.println(computer1.toString());
    }
}
