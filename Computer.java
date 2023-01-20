public class Computer {
    public Processor processor;
    public Ram ram;
    public HardDrive hardDrive;
    public Monitor monitor;
    public Keyboard keyboard;
    public String vendor;
    public String name;
    public HardDrive typeHardDrive;
    public Monitor typeMonitor;


    public Computer(String vendor, String name, Processor processor, Ram ram, HardDrive hardDrive, Monitor monitor, Keyboard keyboard, HardDrive typeHardDrive) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
    public Processor setProcessor(double frequency, int numberOfCores, String manufacturer, double weight) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }
    public Ram setRam(String typeRam, int value, double weight) {
        return new Ram(typeRam, value, weight);
    }
    public HardDrive setHardDrive(HardDrive typeHardDrive, double value, double weight) {
        return new HardDrive(typeHardDrive, value, weight);
    }
    public Monitor setMonitor(double diagonal, Monitor typeMonitor, double weight) {
        return new Monitor(diagonal, typeMonitor, weight);
    }
    public Keyboard setKeyboard(String typeKeyboarb, boolean keyboardBacklight, double weight) {
        return new Keyboard(typeKeyboarb, keyboardBacklight, weight);
    }


/*    public Computer getComputer() {
        return;
    }*/
    public double getTotalWeigth() {
        double totalWeigth = processor.getProcessorWeigth() + monitor.getMonitor() + ram.getRam() + keyboard.getKeyboard() + hardDrive.getHardDrive();
        return totalWeigth;
    }
    public String toString() {
        return  "Производитель:" + vendor + "\n"
                + "Название: " + name + "\n"
                + "Процессор: " + "\n"
                + processor + "\n"
                + ram + "\n"
                + hardDrive + "\n"
                + monitor + "\n"
                + keyboard + "\n" +
                "Общий вес: " + getTotalWeigth() + " Кг.";
    }
}
