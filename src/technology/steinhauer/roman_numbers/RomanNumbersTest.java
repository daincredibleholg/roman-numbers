package technology.steinhauer.roman_numbers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hsteinhauer on 09.07.14.
 */
public class RomanNumbersTest {

    @Test
    public void simpleConversion() {
        int latinNumber = 5;
        String expectedResult = "V";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void anotherSimpleConversion() {
        int latinNmber = 10;
        String expectedResult = "X";

        String actualResult = RomanNumbers.convertFromInt(latinNmber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void  checkCombination () {
        int latinNumber = 2;
        String expectedResult = "II";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkFour () {
        int latinNumber = 4;
        String expectedResult = "IV";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkNine () {
        int latinNumber = 9;
        String expectedResult = "IX";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkFourty () {
        int latinNumber = 40;
        String expectedResult = "XL";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkNinty() {
        int latinNumber = 90;
        String expectedResult = "XC";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkFourHundred () {
        int latinNumber = 400;
        String expectedResult = "CD";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkNineHunded () {
        int latinNumber = 900;
        String expectedResult = "CM";

        String actualResult = RomanNumbers.convertFromInt(latinNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkZero () {
        int latinNumber = 0;
        String actualResult = RomanNumbers.convertFromInt(latinNumber);

        fail("0 isn't part of roman numbers");

    }
}
