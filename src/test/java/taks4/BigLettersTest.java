package taks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class BigLettersTest {

    @Test
    void shouldProperWhenTextIsBigLetters() {
        String text = new BigLetters().formatText("hello");
        Assertions.assertEquals("HELLO", text);
    }

    @Test
    void shouldProperWhenTextIsNotSmallLetters() {
        String text = new BigLetters().formatText("hello");
        Assertions.assertNotEquals("hello", text);
    }

    @Test
    void shouldReturnProperWhenTextIsNull() {
        String textNull = new BigLetters().formatText(null);
        assertNull(textNull);
    }

    @Test
    void shouldReturnProperWhenTextIsEmpty() {
        String textEmpty = new BigLetters().formatText("");
        assertEquals("", textEmpty);
    }
}