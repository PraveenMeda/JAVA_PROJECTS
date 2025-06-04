import java.util.*;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean flag = true;
        while(flag) {

            System.out.println();
            System.out.println("==================================");
            System.out.println("Simple To-Do-List App");
            System.out.println("1.Add a Task");
            System.out.println("2.View a Task");
            System.out.println("3.Delete a Task");
            System.out.println("4.Exit!");
            System.out.println("==================================");
            System.out.println();

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.println();
            switch(choice){
                case 1:
                    System.out.print("Enter Your task : ");
                    tasks.add(sc.nextLine());
                    System.out.println("Task added successfully");
                    break;
                case 2:
                    if(tasks.isEmpty()) System.out.println("No Tasks Found");
                    else {
                        System.out.println("Your To DO Tasks are :");
                        for (int i=0; i<tasks.size();i++){
                            System.out.println("Task "+(i+1)+": "+tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    if(tasks.isEmpty()) System.out.println("No Tasks Found");
                    else{
                        for(int i=0; i<tasks.size(); i++){
                            System.out.println("Task "+(i+1)+": "+tasks.get(i));
                        }
                        System.out.print("Enter task number to be deleted : ");
                        int num = sc.nextInt();
                        if(num>=1 && num<tasks.size()) {
                            tasks.remove(num - 1);
                            System.out.println("Task deleted successfully !!");
                        }else{
                            System.out.println("Invalid Task Number");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting from the application");
                    flag = false;
                    System.exit(0);
                default:
                    System.out.println("Enter value within the range");
                    break;
            }
            if(!flag){
                break;
            }
        }

    }

}
