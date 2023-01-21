public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3.2, 2, "AMD", 0.25);
        Ram ram = new Ram("DDR", 32, 0.25);
        HardDrive hardDrive = new HardDrive(TypeHardDrive.SSD, 320.0, 1.2);
        Monitor monitor = new Monitor(17.1, TypeMonitor.IPS, 5.6);
        Keyboard keyboard = new Keyboard("Bluetooth", false, 0.56);
        Computer computer = new Computer("intel", "x5", processor, ram, hardDrive, monitor, keyboard);
        System.out.println(computer);
        Processor processor1 = new Processor(2.8, 2, "Intel", 0.3);
        Ram ram1 = new Ram("DDR", 64, 0.2);
        HardDrive hardDrive1 = new HardDrive(TypeHardDrive.HDD, 500.0, 1.1);
        Monitor monitor1 = new Monitor(19, TypeMonitor.VA, 6.1);
        Keyboard keyboard1 = new Keyboard("Wired", true, 0.4);
        Computer computer1 = new Computer("intel", "i6", processor1, ram1, hardDrive1, monitor1, keyboard1);
        System.out.println(computer1);

    }
}