package leetcode;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        int out = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                for (int j = i; j > -1; j--) {
                    if (s.charAt(j) != ' ') {
                        out++;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        return out;
    }
}
