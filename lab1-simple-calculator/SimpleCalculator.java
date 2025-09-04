import java.util.Scanner;

public class SimpleCalculator {

    static boolean isStillCalculating = true;
    static int currTotal = 0;

    public static Object getCalculation(int n1, int n2, String oper) {
        switch (oper) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 != 0)
                    return n1 / n2;
                else
                    return "Cannot divide by zero!";
            default:
                return "Invalid operator!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (isStillCalculating) {
            System.out.println("Current Total: " + currTotal);
            if(currTotal == 0) { 
                System.out.print("Enter a number: ");
                currTotal = input.nextInt();
            }
            
            input.nextLine();
            System.out.print("Enter an operator (+, -, *, /): ");
            String oper = input.nextLine().trim();

            // If invalid operator, no need to ask for num2
            if (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))) {
                System.out.println("Invalid operator!");
                continue; // restart loop 
            }

            System.out.print("Enter another number: ");
            int num2 = input.nextInt();

            Object total = getCalculation(currTotal, num2, oper);
            
            if (total instanceof Integer) {
                System.out.println("Result: " + total);
                currTotal = (Integer)total;
            } else {
                System.out.println(total);
            }

            input.nextLine();
            System.out.print("Do you wish to clear the total? (y/n): ");
            String clearTotal = input.nextLine();
            if (clearTotal.equalsIgnoreCase("y")) {
                currTotal = 0;
            }

            input.nextLine(); 
            System.out.print("Do you want to exit? (y/n): ");
            String cont = input.nextLine();
            if (cont.equalsIgnoreCase("y")) {
                isStillCalculating = false;
            }
        }

        input.close();
        System.out.println("Calculator exited.");
    }
}
