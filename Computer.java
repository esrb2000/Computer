public class Computer {
       public Processor processor;
    public Ram ram;
    public HardDrive hardDrive;
    public Monitor monitor;
    public Keyboard keyboard;
    public String vendor;
    public String name;

    public Computer(String vendor, String name, Processor processor, Ram ram, HardDrive hardDrive, Monitor monitor, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
    public Computer setComputer(String name, String vendor, Processor processor, Ram ram, HardDrive hardDrive, Monitor monitor, Keyboard keyboard) {
        return new Computer(name, vendor, processor, ram, hardDrive, monitor, keyboard);
    }
    public double getTotalWeigth() {
        double totalWeigth = processor.getProcessorWeigth() + monitor.getMonitor() + ram.getRam() + keyboard.getKeyboard() + hardDrive.getHardDrive();
        return totalWeigth;
    }
    public String toString() {
        return "Процессор: " + processor;
    }
}
