package leetcode;

import java.util.*;

public class RemoveDuplicates26 {
    public int removeDuplicates(int[] nums) {
        // Brute force
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!temp.contains(nums[i])) {
//                temp.add(nums[i]);
//            }
//        }
//        for (int i = 0; i < temp.size(); i++) {
//            nums[i] = temp.get(i);
//        }
//        return temp.size();

        // Optimization using hash
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i : nums) {
            map.put(counter, i);
            counter++;
        }
        return map.size();
    }
}
