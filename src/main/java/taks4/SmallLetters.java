package taks4;

public class SmallLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
