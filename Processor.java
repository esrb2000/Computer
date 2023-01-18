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
    public Processor setProcessor(double frequency, int numberOfCores, String manufacturer, double weight) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }
    public double getProcessorWeigth() {
        return weight;
    }




}
