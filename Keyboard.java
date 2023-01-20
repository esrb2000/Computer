public class Keyboard {
    private final String typeKeyboard;
    private final boolean keyboardBacklight;
    private final double weight;
    public Keyboard(String typeKeyboard, boolean keyboardBacklight, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.keyboardBacklight = keyboardBacklight;
        this.weight = weight;
    }
    private String getKeyboardBacklight() {
        if (keyboardBacklight == true) {
            return "С подсветкой";
        } else return "Без подсветки";
    }
    public double getKeyboard() {
        return weight;
    }
    public String toString() {
        return "Клавиатура: " + "\n"
                + "Тип: " + typeKeyboard  + '\n'
                + "Наличие подсветки: " + getKeyboardBacklight();
    }
}
