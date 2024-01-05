package creational.builder.computer;

//B1
public class MyComputer63 {
    //B2
    String CPU, RAM, storage, screen;

    //B4
    public MyComputer63(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "CPU: " + this.CPU +
                "\nRAM: " + this.RAM +
                "\nStorage: " + this.storage +
                "\nScreen: " + this.screen;
    }

    //B3
    public static class Builder {
        String CPU, RAM, storage, screen;
        public Builder addCPU(String cpu) {
            this.CPU = cpu;
            return this; // this nay la builder
        }
        public Builder addRAM(String ram) {
            this.RAM = ram;
            return this; // this nay la builder
        }public Builder addStorage(String storage) {
            this.storage = storage;
            return this; // this nay la builder
        }public Builder addScreen(String screen) {
            this.screen = screen;
            return this; // this nay la builder
        }
        public MyComputer63 build() {
            return new MyComputer63(this);
        }
    }
}
