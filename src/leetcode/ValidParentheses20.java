package leetcode;

import java.util.*;

public class ValidParentheses20 {

    // Brute force
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                boolean full = false;
                for (int j = i + 1; j < s.length(); j+=2) {
                    if (s.charAt(j) == ')') {
                        full = true;
                        break;
                    }
                }
                if (!full) {
                    return false;
                }
            }
            if (temp == '{') {
                boolean full = false;
                for (int j = i + 1; j < s.length(); j+=2) {
                    if (s.charAt(j) == '}') {
                        full = true;
                        break;
                    }
                }
                if (!full) {
                    return false;
                }
            }
            if (temp == '[') {
                boolean full = false;
                for (int j = i + 1; j < s.length(); j+=2) {
                    if (s.charAt(j) == ']') {
                        full = true;
                        break;
                    }
                }
                if (!full) {
                    return false;
                }
            }
        }
        return true;
    }

    // Optimized
    public boolean isValidO(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
