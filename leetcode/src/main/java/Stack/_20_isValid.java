package Stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Author:Jude
 * Date:2022-01-16 下午11:45
 */
public class _20_isValid {

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) return false;

        HashMap<Character, Character> hashMap = new HashMap<Character,Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (hashMap.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() !=hashMap.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
