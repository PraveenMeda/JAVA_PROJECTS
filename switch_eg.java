import java.util.Scanner;

public class switch_eg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Day = sc.nextLine().toLowerCase();
        switch (Day){
            case "monday" :
                System.out.println("Learn Java");
                break;
            case "tuesday" :
                System.out.println("Learn Python");
                break;
            case "wednesday" :
                System.out.println("Learn Web");
                break;
            case "thursday" :
                System.out.println("Learn Aptitude");
                break;
            case "friday" :
                System.out.println("Learn Reasoning");
                break;
            default:
                System.out.println("Enjoy the weekend");
                break;
        }
    }
}
