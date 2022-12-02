package taks4;

public class BigLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
