package leetcode.easy;

import java.util.*;

public class valid_parentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray(); 

        for(char ch : arr){
            // push opening brackets in the stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            // process closing brackets
            else{
                if(stack.isEmpty()) return false;

                //take out the top in a variable to compare
                char top = stack.pop();
                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')){
                    continue;
                } else {
                    return false;
                }
            }
        }
        // after doing all this if stack is empty return true
        return (stack.isEmpty());
    }

    // Order doent matter (wrong anwser)
    static boolean isValidBrute(String s) {
        Map<Character, Integer> menu = new HashMap<>();
        menu.put('(', 10);
        menu.put(')', 10);
        menu.put('{', 20);
        menu.put('}', 20);
        menu.put('[', 30);
        menu.put(']', 30);
        menu.put('<', 40);
        menu.put('>', 40);
        char[] brack = s.toCharArray();
        int xor = 0;
        for(int i=0; i<brack.length; i++){
            xor = xor ^ menu.get(brack[i]);
        }
        return (xor==0);
    }
    public static void main(String[] args) {
        String str = "([]";
        System.out.println(isValid(str));
    }
}
