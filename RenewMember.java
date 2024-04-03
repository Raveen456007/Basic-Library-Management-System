import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
public class RenewMember implements inner_process {
    String memID;
    public void calculation(){
        int count=0;
        int result=0;
        Scanner scanner3=new Scanner(System.in);
        System.out.print("**Renewing membership section**\n"+"Do you want to proceed? (enter 1 to acceept or any number to reject) - ");
        count=scanner3.nextInt();
        while(count==1){
            System.out.print("Enter the member ID to check - ");
            memID=scanner3.nextLine();
            memID=scanner3.nextLine();
        try {
            BufferedReader bufferedReader4=new BufferedReader(new FileReader("member_details.txt"));
            String line_1=null,line_2=null,line_3=null,line_4=null,line_5=null,line_6=null;
            boolean comp=false;
            int today_date=0,reg_date=0;
            while ((line_1=bufferedReader4.readLine())!=null) {
                comp=memID.equals(line_1);
                if (comp==true) {
                    line_2=bufferedReader4.readLine();
                    line_3=bufferedReader4.readLine();
                    line_4=bufferedReader4.readLine();
                    line_5=bufferedReader4.readLine();
                    line_6=bufferedReader4.readLine();
                    break;
                }   
            }
            if(comp==true){
                System.out.print("Enter the today's date as integer form\n"+"\n(year|month|date) - ");
            today_date=scanner3.nextInt();
            System.out.println("The registered date - "+line_6);
            System.out.print("Re-enter the registered date as integer form\n"+"\n(year|month|date) - ");
            reg_date=scanner3.nextInt();
            result=today_date-reg_date;
            int result2=result%1000;
            if(result2==0){
                System.out.println("\nNeed to renew!!");
                FileWriter file1=new FileWriter("membership_renew.txt",true);
                file1.write(line_1+"\n");
                file1.write(line_2+"\n");
                file1.write(line_3+"\n");
                file1.write(line_4+"\n");
                file1.write(line_5+"\n");
                file1.write(line_6+"\n");
                file1.close();
            }
            else{
                System.out.println("\nNo need to renew!!");
            }
            System.out.print("Do you want to proceed? (enter 1 to acceept or any number to reject) - ");
            count=scanner3.nextInt();
            }
            else{
                System.out.println("\nERROR try again!!");
                System.out.print("Enter data again (enter 1 to acceept or any number to reject) - ");
                count=scanner3.nextInt();
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        }
    }
    
}
interface inner_process{
    public void calculation();
}
