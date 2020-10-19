package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void getConcatanatedStringTest() {
        StringUtil string1 = new StringUtil();
        Assertions.assertEquals(" qwerty :))asdf", string1.getConcatnatedString("asdf") );
        Assertions.assertEquals(" qwerty :)) alise123", string1.getConcatnatedString(" alise123"));
        Assertions.assertEquals(" qwerty :))", string1.getConcatnatedString(""));
    }

    @Test
    void getSymbolIndexTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(-1, stringUtil.getSymbolIndex("asdfgg", '3'));
        Assertions.assertEquals(12, stringUtil.getSymbolIndex("ЮЛЯ МОЛОДЕЦ:)", ')'));
        Assertions.assertEquals(-1, stringUtil.getSymbolIndex(" ", 'g'));
        Assertions.assertEquals(0, stringUtil.getSymbolIndex(" I'll win java", ' '));
    }
    @Test
    void isEqualStringsTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(true, stringUtil.isEqualStrings("asdfgg", "asdfgg"));
        Assertions.assertEquals(false, stringUtil.isEqualStrings("asdfgg", "Asdfgg"));
        Assertions.assertEquals(false, stringUtil.isEqualStrings("asdfg g", "asdfgg"));
        Assertions.assertEquals(true, stringUtil.isEqualStrings("ABCDEfgh!!", "ABCDEfgh!!"));

    }

    @Test
    void getUpperCaseWithoutStartEndWhitespacesTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("ASDFGG", stringUtil.getUpperCaseWithoutStartEndWhitespaces(" asdfgg "));
        Assertions.assertEquals("ASDFGG", stringUtil.getUpperCaseWithoutStartEndWhitespaces(" asdfgg"));
        Assertions.assertEquals("1233GGH", stringUtil.getUpperCaseWithoutStartEndWhitespaces(" 1233GGh "));
        Assertions.assertEquals("ASD , FGG", stringUtil.getUpperCaseWithoutStartEndWhitespaces(" asd , fgg "));
        Assertions.assertEquals("", stringUtil.getUpperCaseWithoutStartEndWhitespaces("  "));
        Assertions.assertEquals("", stringUtil.getUpperCaseWithoutStartEndWhitespaces(""));
    }

    @Test
    void getSubStringTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("Substring is empty", stringUtil.getSubString(" asdfgg "));
        Assertions.assertEquals("ешать задачи, пора спат", stringUtil.getSubString("я устала решать задачи, пора спать "));
        Assertions.assertEquals("012345", stringUtil.getSubString("0123456789012345"));
        Assertions.assertEquals("Substring is empty", stringUtil.getSubString(""));
    }

    @Test
    void getSadFaceTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(" asdfgg:( ", stringUtil.getSadFace(" asdfgg:) "));
        Assertions.assertEquals(" asdfgg:() ", stringUtil.getSadFace(" asdfgg:)) "));
        Assertions.assertEquals(" asdfgg", stringUtil.getSadFace(" asdfgg"));
    }

    @Test
    void isStartsAndEndsWith() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(true, stringUtil.isStartsAndEndsWith("java, c+++, java", "java"));
        Assertions.assertEquals(false, stringUtil.isStartsAndEndsWith("java, c+++, java.", "java"));
        Assertions.assertEquals(false, stringUtil.isStartsAndEndsWith("Java1, c+++, java", "java"));
        Assertions.assertEquals(false, stringUtil.isStartsAndEndsWith("java, c+++, java", "Java"));
        Assertions.assertEquals(false, stringUtil.isStartsAndEndsWith(" java, c+++, java", "java"));
    }

    @Test
    void getNumberOfVovelsTest() {
        StringUtil string = new StringUtil();
        Assertions.assertEquals(4, string.getNumberOfVovels("java, c+++, java."));
        Assertions.assertEquals(0, string.getNumberOfVovels(""));
        Assertions.assertEquals(4, string.getNumberOfVovels("AERGJKK ,,ае"));
        Assertions.assertEquals(0, string.getNumberOfVovels(",,  hL1230"));
        Assertions.assertEquals(0, string.getNumberOfVovels(null));
    }

    @Test
    void getNumberOfDotsCommasExclamationMarksTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(3, stringUtil.getNumberOfDotsCommasExclamationMarks("java, c+++, java."));
        Assertions.assertEquals(3, stringUtil.getNumberOfDotsCommasExclamationMarks("java,\n c+++,\t java."));
        Assertions.assertEquals(6, stringUtil.getNumberOfDotsCommasExclamationMarks("java, c+++, java.!!!"));
        Assertions.assertEquals(0, stringUtil.getNumberOfDotsCommasExclamationMarks(""));
        Assertions.assertEquals(0, stringUtil.getNumberOfDotsCommasExclamationMarks(null));
    }

    @Test
    void isPalindromeStringTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(false, stringUtil.isPalindromeString("java, c+++, java."));
        Assertions.assertEquals(false, stringUtil.isPalindromeString(""));
        Assertions.assertEquals(false, stringUtil.isPalindromeString("java123!321avaj "));
        Assertions.assertEquals(true, stringUtil.isPalindromeString("Java,\n,avaj"));
        Assertions.assertEquals(true, stringUtil.isPalindromeString("Java avaj"));
        Assertions.assertEquals(true, stringUtil.isPalindromeString("JavaavaJ"));
        Assertions.assertEquals(false, stringUtil.isPalindromeString(null));
    }

    @Test
    void getNumberOfWords() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(3, stringUtil.getNumberOfWords("java, c+++, java."));
        Assertions.assertEquals(3, stringUtil.getNumberOfWords(" java, c+++, java. "));
        Assertions.assertEquals(4, stringUtil.getNumberOfWords(" Как решить задачу, а?"));
        Assertions.assertEquals(0, stringUtil.getNumberOfWords(" "));
    }

    @Test
    void getInitialTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("П.Ю.Л", stringUtil.getInitial("Портнова Юлия Леонидовна"));
    }

    @Test
    void getDigitsTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("3577", stringUtil.getDigits("Портнова357 Юли 7 я Леонидовна"));
        Assertions.assertEquals("087666999", stringUtil.getDigits(" 0 8 7 666,, 999"));
    }

    @Test
    void getDifferentLettersTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("инфмаияпесс", stringUtil.getDifferentLetters("информация", "процессор"));
        Assertions.assertEquals("мретдых", stringUtil.getDifferentLetters("море", "отдых"));
        Assertions.assertEquals("lrx", stringUtil.getDifferentLetters("letter", "text"));
    }








}
