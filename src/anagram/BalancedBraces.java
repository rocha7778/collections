package anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedBraces {

    public static List<String> balancedBraces(List<String> braces) {
        List<String> result = new ArrayList<>();
        
        for (String str : braces) {
            result.add(isBalanced(str) ? "yes" : "no");
        }
        
        return result;
    }
    
    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // Cierre sin apertura correspondiente
                }
                
                char top = stack.pop();
                
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false; // Mismatch de apertura y cierre
                }
            }
        }
        
        return stack.isEmpty(); // Verificar si hay algún cierre sin apertura correspondiente
    }
    
    public static void main(String[] args) {
        List<String> braces = new ArrayList<>();
        braces.add("()");
        braces.add("[{()}]");
        braces.add("{[}]");
        
        List<String> result = balancedBraces(braces);
        for (String str : result) {
            System.out.println(str);
        }
    }
}

