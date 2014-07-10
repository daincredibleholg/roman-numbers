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
        latinToRomanNumber.put(900, "CM");
        latinToRomanNumber.put(500, "D");
        latinToRomanNumber.put(400, "CD");
        latinToRomanNumber.put(100, "C");
        latinToRomanNumber.put(90, "XC");
        latinToRomanNumber.put(50, "L");
        latinToRomanNumber.put(40, "XL");
        latinToRomanNumber.put(10, "X");
        latinToRomanNumber.put(9, "IX");
        latinToRomanNumber.put(5, "V");
        latinToRomanNumber.put(4, "IV");
        latinToRomanNumber.put(1, "I");
    }

    public static String convertFromInt(final int number) {
        if (number == 0) {
            throw new IllegalArgumentException("0 isn't available in roman numbers.");
        }
        int rest = number;
        String result = "";
        for (Map.Entry curMapping : latinToRomanNumber.entrySet()) {
            int latinNumber = (Integer) curMapping.getKey();
            String romanNumber = (String) curMapping.getValue();
            while (rest >= latinNumber) {
                result += romanNumber;
                rest -= latinNumber;
            }

        }
        return result;
    }
}
