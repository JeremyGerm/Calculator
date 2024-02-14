import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {

        System.out.println("Please input two numbers.");

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();

        double num2 = scan.nextDouble();

        System.out.println("Would you like to add, subtract, multiply, or divide?");

        Scanner keyboardInput = new Scanner(System.in);

        String operation = keyboardInput.nextLine();

        switch(operation) {
            case "add":
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case "subtract":
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
            case "multiply":
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
            case "divide":
            if(num2 == 0) {
                System.out.println("Divide by zero error.");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            break;
            default:
            break;
        }
        scan.close();
    }
}
