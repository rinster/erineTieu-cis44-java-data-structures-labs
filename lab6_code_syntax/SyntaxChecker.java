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
        Stack buffer = new ArrayStack<>(line.length());
        HashMap<String, boolean> brackets = new HashMap<String, boolean>();
        brackets.put("{", true);
        brackets.put("[", true);
        brackets.put("(", true);

        System.out.println(brackets);

        // Create a hashmap that will have the brackets to check against
        // Initialize a stack to track the open brackets
        // Iterate through the string
        // for each open bracket that we see, add a closing on to the stack
        // if the bracket is closing, it should match the last added bracket in the
        // stack and pop it off
        // if it isn't, return false
        // The state of the stack should return empty to be a valid stack

        // Your implementation here...

        return false; // Placeholder
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
