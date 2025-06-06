import java.util.Scanner;

public class Caluculator_using_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to simple Java Calculator");
        System.out.println();
        System.out.print("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println();
        boolean flag = true;

        while (flag) {
            System.out.println();

            System.out.println("            Choose any option            ");
            System.out.println("                1.Additon            ");
            System.out.println("                2.SUbtraction        ");
            System.out.println("                3.Multiplication     ");
            System.out.println("                4.Division           ");
            System.out.println("                5.Modulo             ");
            System.out.println("                6.Exit             ");
            System.out.println();

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    System.out.println("Addition : "+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction : "+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication : "+(a*b));
                    break;
                case 4:
                    System.out.println("Division : "+(a/b));
                    break;
                case 5:
                    System.out.println("Modulo : "+(a%b));
                    break;
                case 6:
                    System.out.println("Thanks for using simple calculator");
                    flag = false;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            if(!flag){
                System.out.println("Exited");
                break;
            }
        }

    }
}
