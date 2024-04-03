import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
public class fineData {
    public void process4(){
        String li1,li2,li3,li4;
        boolean compare2=false;
        String storeA[]=new String[400];
        double count3=0,newDate2=0,newDate3=0,newToday=0,result1=0,result3=0;
        int newDate11=0,newDate21=0,newDate31=0,result2=0,newDate1=0; 
        Scanner scanner6=new Scanner(System.in);
        try {
            FileWriter writer1=new FileWriter("fines.txt",true);
            System.out.print("Do you want to enter data?(Enter 1 to accept or any number to reject) - ");
            newDate1=scanner6.nextInt();
            while (newDate1==1) {
                System.out.print("Enter the member ID - ");
                li1=scanner6.nextLine();
                System.out.print("Enter amount to be paid - ");
                newDate2=scanner6.nextDouble();
                writer1.write("The member ID - "+li1+"\n");
                writer1.write("Fine to be paid - "+newDate2+"\n");
                System.out.print("Do you want to enter data?(Enter 1 to accept or any number to reject) - ");
                newDate1=scanner6.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
