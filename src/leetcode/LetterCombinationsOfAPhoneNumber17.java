package leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber17 {
    public List<String> letterCombinations(String digits) {
        int length = 1;

        // Find length of out
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == 2 || digits.charAt(i) == 3 || digits.charAt(i) == 4 || digits.charAt(i) == 5 ||
                    digits.charAt(i) == 6 || digits.charAt(i) == 8) {
                length *= 3;
            }
            if (digits.charAt(i) == 7 || digits.charAt(i) == 9) {
                length *= 3;
            }
        }

        List<String> out = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            if (digits.charAt(i) == '2') {
                for (int j = 0; j < out.size(); j++) {

                }
            }
            if (digits.charAt(i) == '3') {

            }
            if (digits.charAt(i) == '4') {

            }
            if (digits.charAt(i) == '5') {

            }
            if (digits.charAt(i) == '6') {

            }
            if (digits.charAt(i) == '7') {

            }
            if (digits.charAt(i) == '8') {

            }
            if (digits.charAt(i) == '9') {

            }
        }
        return out;
    }
}
