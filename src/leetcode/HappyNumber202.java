package leetcode;

import java.util.*;

public class HappyNumber202 {
    // Optimized
    public boolean isHappy(int n) {
        Set<Integer> differentNums = new HashSet<Integer>();
        while (differentNums.add(n)) {
            int sum = 0;
            while (n > 0) {
                int numOne = n%10;
                sum += numOne * numOne;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
