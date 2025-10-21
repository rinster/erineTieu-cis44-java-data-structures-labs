package lab6_code_syntax;

import java.util.HashMap;

public class SyntaxChecker {

    /**
     * Uses a stack to check if a line of code has balanced symbols.
     * 
     * @param line The string of code to check.
     * @return true if symbols are balanced, false otherwise.
     */
    public static boolean isBalanced(String line) {
        // TODO: Implement this method using a Stack.
        Stack<Character> buffer = new ArrayStack<>(line.length());

        /**
         * Iterate through each 'ch' in line
         * check if its an opening bracket, push to stack
         * else if closing bracket
         * - return false if empty
         * - pop off the stack
         * - check if char is matching open bracket,
         * -- if not return false
         */
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                buffer.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (buffer.isEmpty())
                    return false;

                char open = buffer.pop();
                if ((ch == ')' && open != '(') ||
                        (ch == '{' && open != '}') ||
                        (ch == '[' && open != ']')) {
                    return false; // brackets don't match
                }
            }
        }

        return buffer.isEmpty(); // stack should be empty on completion
    }

    public static void main(String[] args) {
        String line1 = "public static void main(String[] args) { ... }"; // Should be true
        String line2 = "int x = (5 + [a * 2]);"; // Should be true
        String line3 = "System.out.println('Hello');)"; // Should be false (extra closing parenthesis)
        String line4 = "List list = new ArrayList<{String>();"; // Should be false (mismatched)
        String line5 = "if (x > 0) {"; // Should be false (unmatched opening brace)

        System.out.println("Line 1 is balanced: " + isBalanced(line1));
        System.out.println("Line 2 is balanced: " + isBalanced(line2));
        System.out.println("Line 3 is balanced: " + isBalanced(line3));
        System.out.println("Line 4 is balanced: " + isBalanced(line4));
        System.out.println("Line 5 is balanced: " + isBalanced(line5));
    }
}
