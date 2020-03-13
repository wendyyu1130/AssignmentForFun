package Strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStringsTest {
    private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcat1() {
        String string1 = " Picky";
        String string2 = "Micky";
        String expected = "Micky Picky";
        String actual = basicStrings.flipConcat(string1, string2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcat2() {
        String string1 = " strange";
        String string2 = "cookie";
        String expected = "cookie strange";
        String actual = basicStrings.flipConcat(string1, string2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcat3() {
        String string1 = " 4pm";
        String string2 = "2am";
        String expected = "2am 4pm";
        String actual = basicStrings.flipConcat(string1, string2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getChar1() {
        String string1 = "Can you hear me";
        char expected = 'y';
        char actual = basicStrings.getChar(string1, 4);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getChar2() {
        String string1 = "it sounds strange!";
        char expected = 's';
        char actual = basicStrings.getChar(string1, 8);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void iCantSee1() {
        String string1 = "Break";
        String expected = "     ";
        String actual = basicStrings.iCantSee(string1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSee2() {
        String string1 = "    ";
        String expected = "    ";
        String actual = basicStrings.iCantSee(string1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSee3() {
        String string1 = "Do you like it";
        String expected = "              ";
        String actual = basicStrings.iCantSee(string1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClear1() {
        String string1 = "Do you like it";
        String expected = "DO YOU LIKE IT";
        String actual = basicStrings.loudAndClear(string1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void loudAndClear2() {
        String string1 = "Great";
        String expected = "GREAT";
        String actual = basicStrings.loudAndClear(string1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void loudAndClear3() {
        String string1 = "I don't think so";
        String expected = "I DON'T THINK SO";
        String actual = basicStrings.loudAndClear(string1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void reverseCase() {
        String string1 = "Do you like it";
        String expected = "dO YOU LIKE IT";
        String actual = basicStrings.reverseCase(string1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void reverseCase2() {
        String string1 = "WOW I see YOU";
        String expected = "wow i SEE you";
        String actual = basicStrings.reverseCase(string1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void reverseCase3() {
        String string1 = "Meow";
        String expected = "mEOW";
        String actual = basicStrings.reverseCase(string1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void oneAtATime() {
        String string1 = "Pes";
        String string2 = "lae";
        String expected = "Please";
        String actual = basicStrings.oneAtATime(string1, string2);
        Assert.assertEquals(expected, actual);
    }
}