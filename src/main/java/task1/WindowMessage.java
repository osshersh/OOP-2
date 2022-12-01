package task1;

public class WindowMessage extends Message{
    @Override
    String getMessage() {
        return "This is class " + WindowMessage.class.getSimpleName();
    }
}
