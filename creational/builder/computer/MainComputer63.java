package creational.builder.computer;

public class MainComputer63 {
    public static void main(String[] args) {
        MyComputer63 myComputer = new MyComputer63.Builder()
                .addCPU("Ultra core 1500")
                .addRAM("DDR5 64000 Mhz")
                .addStorage("2TB NVMe5 Evo Samsung")
                .addScreen("24 inch 100% RGB")
                .build();
        System.out.println(myComputer.toString());
    }
}
