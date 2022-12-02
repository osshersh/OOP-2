package taks4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallLettersTest {

    @Test
    void shouldProperWhenTextIsSmallLetters() {
        String text = new SmallLetters().formatText("HELLO");
        Assertions.assertEquals("hello", text);
    }

    @Test
    void shouldProperWhenTextIsNotBigLetters() {
        String text = new SmallLetters().formatText("HELLO");
        Assertions.assertNotEquals("HELLO", text);
    }
}