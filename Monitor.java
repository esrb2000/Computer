public class Monitor {
    private final double diagonal;
    private final TypeMonitor typeMonitor;
    private final double weight;

    public Monitor(double diagonal, Monitor typeMonitor, double weight) {
        this.diagonal = diagonal;
        this.typeMonitor = typeMonitor;
        this.weight = weight;
    }

    public double getMonitor() {
        return weight;
    }
    public String toString() {
        return "Экран: " + "\n"
                + "Диагональ: " + diagonal  + " inch" + '\n'
                + "Тип: " + typeMonitor;
    }
}
