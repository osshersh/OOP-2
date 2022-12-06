package task1;

public class ConsoleMessage extends Message{
    @Override
    String getMessage() {
        return "This is class " + ConsoleMessage.class.getSimpleName();
    }
}
