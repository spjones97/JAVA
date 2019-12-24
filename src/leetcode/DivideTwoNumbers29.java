package leetcode;

public class DivideTwoNumbers29 {
    public static void main(String[] args) {
        int dividend = -1;
        int divisor = 1;
        System.out.println(divide(dividend, divisor));
    }
    public static int divide(int dividend, int divisor) {
        int count = 0;
        if (dividend < 0 && divisor >= 0) {
            while (dividend <= (-1 * divisor)) {
                dividend += divisor;
                count--;
            }
        } else if (divisor < 0 && dividend >= 0) {
            while (dividend >= (-1 * divisor)) {
                dividend += divisor;
                count--;
            }
        } else if (dividend < 0 && divisor < 0) {
            while (dividend <= divisor) {
                dividend -= divisor;
                count++;
            }
        } else {
            while (dividend >= divisor) {
                dividend -= divisor;
                count++;
            }
        }
        return count;
    }
}