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
        String expectedResult = "X";
        int latinNmber = 10;

        String actualResult = RomanNumbers.convertFromInt(latinNmber);
        assertEquals(expectedResult, actualResult);
    }
}
