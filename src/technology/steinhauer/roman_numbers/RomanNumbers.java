package technology.steinhauer.roman_numbers;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class provides a simple arabic-to-roman number converter.
 * You can convert any number between {@link #MIN_ARABIC_VALUE} and {@link #MAX_ARABIC_VALUE}.
 */
public class RomanNumbers {
    private static final int MAX_ARABIC_VALUE = 3999;
    private static final int MIN_ARABIC_VALUE = 1;

    static Map<Integer, String> arabicToRomanNumber = new LinkedHashMap<>();

    static {
        arabicToRomanNumber.put(1000, "M");
        arabicToRomanNumber.put(900, "CM");
        arabicToRomanNumber.put(500, "D");
        arabicToRomanNumber.put(400, "CD");
        arabicToRomanNumber.put(100, "C");
        arabicToRomanNumber.put(90, "XC");
        arabicToRomanNumber.put(50, "L");
        arabicToRomanNumber.put(40, "XL");
        arabicToRomanNumber.put(10, "X");
        arabicToRomanNumber.put(9, "IX");
        arabicToRomanNumber.put(5, "V");
        arabicToRomanNumber.put(4, "IV");
        arabicToRomanNumber.put(1, "I");
    }

    public static String convertFromInt(final int arabicNumber) {
        if (arabicNumber < MIN_ARABIC_VALUE || arabicNumber > MAX_ARABIC_VALUE) {
            throw new IllegalArgumentException("0 isn't available in roman numbers.");
        }
        int rest = arabicNumber;
        String result = "";
        for (Map.Entry curMapping : arabicToRomanNumber.entrySet()) {
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
