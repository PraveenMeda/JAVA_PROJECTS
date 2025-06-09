package Calculator_App;

import java.util.*;

public class Simple_Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("Enter the operator(+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        double result;

        switch(op) {
            case '+':
                result = a + b;
                System.out.println(a + " " + op + " " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " " + op + " " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " " + op + " " + b + " = " + result);
                break;
            case '/':
                if(b == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                }
                result = a / b;
                System.out.println(a + " " + op + " " + b + " = " + result);
                break;
            case '%':
                result = a % b;
                System.out.println(a + " " + op + " " + b + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        sc.close();
        
    }
    
}
