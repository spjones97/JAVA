package leetcode;

import java.util.*;

public class RemoveElement27 {
    // Brute Force
    public int removeElement(int[] nums, int val) {
        List<Integer> temp = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp.add(counter, nums[i]);
                counter += 1;
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        return temp.size();
    }
}
