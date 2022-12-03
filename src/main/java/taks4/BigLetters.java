package taks4;

public class BigLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        return text.toUpperCase();
    }
}
