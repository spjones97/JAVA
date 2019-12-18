package hashmap;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println("The number " + m.getKey() + " is " + m.getValue());
        }
    }
}
