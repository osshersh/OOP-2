package taks4;

public class SmallLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        if (text == null) {
            return null;
        }
        return text.toLowerCase();
    }
}
