package leetcode;

public class RomanToInteger13 {
    // Brute force
    public int romanToInt(String s) {
        int out = 0;
        int tempNum;
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (tempChar == 'I') {
                tempNum = 1;
            }
            if (tempChar == 'V') {
                tempNum = 5;
            }
            if (tempChar == 'X') {
                tempNum = 10;
            }
            if (tempChar == 'L') {
                tempNum = 50;
            }
            if (tempChar == 'C') {
                tempNum = 100;
            }
            if (tempChar == 'D') {
                tempNum = 500;
            }
            if (tempChar == 'M') {
                tempNum = 1000;
            }

        }
        return out;
    }
}
