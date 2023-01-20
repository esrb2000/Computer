public class HardDrive {
    private final HardDrive typeHardDrive;
    private final double value;
    private final double weight;
    public HardDrive(HardDrive typeHardDrive, double value, double weight) {
        this.typeHardDrive = typeHardDrive;
        this.value = value;
        this.weight = weight;
    }
    public double getHardDrive() {
        return weight;
    }
    public String toString() {
        return "Накопитель информации: " + "\n"
                + "Тип памяти: " + typeHardDrive + '\n'
                + "Объем памяти: " + value + " Gb";
    }

}
