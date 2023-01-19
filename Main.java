public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3.2, 2, "AMD", 0.25);
        Ram ram = new Ram();
        HardDrive hardDrive = new HardDrive();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer("intel", "x5", processor, ram, hardDrive, monitor, keyboard);
        System.out.println(computer.getTotalWeigth());
    }
}