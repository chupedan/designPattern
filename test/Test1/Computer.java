package test.Test1;

public class Computer {
    String cpu, ram, storage, screen;
    int gia;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.screen = builder.screen;
        this.gia = builder.gia;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                ", gia=" + gia +
                '}';
    }

    public static class Builder{
        String cpu, ram, storage, screen;
        int gia;
        public Builder addCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder addRam(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder addStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder addScreen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder addGia(int gia) {
            this.gia = gia;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
