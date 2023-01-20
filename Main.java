public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3.2, 2, "AMD", 0.25);
        Ram ram = new Ram("DDR", 32, 0.25);
        HardDrive hardDrive = new HardDrive(TypeHardDrive.SSD, 320.0, 1.2);
        Monitor monitor = new Monitor(17.1, TypeMonitor.IPS, 5.6);
        Keyboard keyboard = new Keyboard("Bluetooth", false, 0.56);
        //Computer computer = new Computer("intel", "x5", processor, ram, hardDrive, monitor, keyboard);
       // System.out.println(computer);

    }
}