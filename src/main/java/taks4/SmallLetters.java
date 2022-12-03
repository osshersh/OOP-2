package taks4;

public class SmallLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        return text.toLowerCase();
    }
}
