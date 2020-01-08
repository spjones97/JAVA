package leetcode;

import java.util.*;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int soFar = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            end = Math.max(end + nums[i], nums[i]);
            soFar = Math.max(soFar, end);
        }
        return soFar;
    }
}
