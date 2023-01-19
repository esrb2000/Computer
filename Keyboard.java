public class Keyboard {
    private final String typeKeyboard;
    private final boolean keyboardBacklight;
    private final double weight;
    public Keyboard(String typeKeyboard, boolean keyboardBacklight, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.keyboardBacklight = keyboardBacklight;
        this.weight = weight;
    }
    public double getKeyboard() {
        return weight;
    }

}
