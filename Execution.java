import java.util.Scanner;
public class Execution extends Administrator{ 
    public static void main(String[] args) {
        System.out.println("\n\n"+"Wellcome to the National Library Management System UK");
        System.out.println("Enter 1 - Administration\n"+"Enter 2 - To exit the system");
        Scanner S1=new Scanner(System.in);
        int choice=0;
        choice=S1.nextInt();
        if(choice==1)
        {
            Administrator a1=new Administrator();
            a1.layer();
        }
        else if(choice==2)
        {
            System.out.println("Thank You");
        }
        else
        {
            System.out.println("ERROR");
            choice=S1.nextInt();
            while(choice!=1 && choice!=2 && choice!=3)
            {
                choice=S1.nextInt();
                System.out.println("ERROR");
            }
            if(choice==1)
        {
            Administrator a1=new Administrator();
            a1.layer();
        }
        else if(choice==2)
        {
            System.out.println("Thank You");
        }

        } 
    }
}
