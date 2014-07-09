package technology.steinhauer.roman_numbers;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hsteinhauer on 09.07.14.
 */
public class RomanNumbers {
    static Map<Integer, String> latinToRomanNumber = new LinkedHashMap<>();

    static {
        latinToRomanNumber.put(1000, "M");
        latinToRomanNumber.put(500, "D");
        latinToRomanNumber.put(100, "C");
        latinToRomanNumber.put(50, "L");
        latinToRomanNumber.put(10, "X");
        latinToRomanNumber.put(5, "V");
        latinToRomanNumber.put(1, "I");
    }

    public static String convertFromInt(final int number) {
        return latinToRomanNumber.get(number);
    }
}
