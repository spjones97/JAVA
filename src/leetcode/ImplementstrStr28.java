package leetcode;

public class ImplementstrStr28 {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < (haystack.length() - needle.length()); i++) {
            int idx = 0;
            boolean there = false;
            if (haystack.charAt(i) == needle.charAt(idx)) {
                there = true;
                for (int j = i + 1; idx < needle.length(); j++, idx++) {
                    if (haystack.charAt(j) != needle.charAt(idx)) {
                        there = false;
                        break;
                    }
                }
            }
            if (there) {
                return i;
            }
        }
        return -1;
    }
}
