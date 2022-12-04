package taks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class BigLettersTest {

    @Test
    void shouldConvertToUpperCase() {
        String text = new BigLetters().formatText("hello");
        Assertions.assertEquals("HELLO", text);
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