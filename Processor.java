public class Processor {
    private final double frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final double weight;

    public Processor(double frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getProcessorWeigth() {
        return weight;
    }
    public String toString() {
        return "Частота: " + frequency + " Ghz" + "\n" +
                "Колличество ядер: " + numberOfCores + "\n" +
                "Производитель: " + manufacturer;
    }
}
