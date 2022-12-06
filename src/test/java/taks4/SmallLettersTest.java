package taks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallLettersTest {

    @Test
    void shouldConvertToLowerCase() {
        String text = new SmallLetters().formatText("HELLO");
        Assertions.assertEquals("hello", text);
    }

    @Test
    void shouldReturnNullWhenTextIsNull() {
        String textNull = new BigLetters().formatText(null);
        assertNull(textNull);
    }

    @Test
    void shouldReturnEmptyTextWhenTextIsEmpty() {
        String textEmpty = new BigLetters().formatText("");
        assertEquals("", textEmpty);
    }
}