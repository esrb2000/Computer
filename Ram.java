public class Ram {
    private final String typeRam;
    private final int value;
    private final double weight;

    public Ram(String typeRam, int value, double weight) {
        this.typeRam = typeRam;
        this.value = value;
        this.weight = weight;
    }
    public double getRam() {
        return weight;
    }
    public String toString() {
        return "Оперативная память: " + "\n"
                + "Тип памяти: " + typeRam + '\n'
                + "Объем памяти: " + value + " Gb";
    }

}
