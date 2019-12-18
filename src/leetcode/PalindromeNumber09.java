package leetcode;

public class PalindromeNumber09 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int remainder;
        int original = x;
        while (x != 0) {
            remainder = x % 10;
            rev = rev * 10 + remainder;
            x /= 10;
        }
        return original == rev;
    }
}
