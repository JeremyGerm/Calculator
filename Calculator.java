import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {

        System.out.println("Please input two integers.");

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        int num2 = scan.nextInt();

        System.out.println("Would you like to add or subtract?");

        Scanner keyboardInput = new Scanner(System.in);

        String operation = keyboardInput.nextLine();

        switch(operation) {
            case "add":
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case "subtract":
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        }
    }
}
