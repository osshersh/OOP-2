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
    void shouldReturnProperWhenTextIsNullOrEmpty() {
        String textNull = new BigLetters().formatText(null);
        String textEmpty = new BigLetters().formatText("");
        assertNull(textNull);
        assertNull(textEmpty);
    }
}