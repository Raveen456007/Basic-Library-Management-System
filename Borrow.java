import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
public class Borrow {
    String bookname;
    String bookISBN;
    String memberID;
    String date;
    Borrow(String bookname,String bookISBN,String memberID,String date){
        this.bookname=bookname;
        this.bookISBN=bookISBN;
        this.memberID=memberID;
        this.date=date;
    }
    public static void process3(){
        System.out.println("\n***Borrowing Section***");
        try {
            Scanner sc1=new Scanner(System.in);
            String in_isbn,in_name,in_member,in_date;
            int choice1;
            System.out.print("Do you want to enter data? (enter 1 to accept or any number to reject) - ");
            choice1=sc1.nextInt();
            while(choice1==1){
            System.out.print("ISBN - ");
            in_isbn=sc1.nextLine();
            in_isbn=sc1.nextLine();
            System.out.print("Book name - ");
            in_name=sc1.nextLine();
            System.out.print("Member ID - ");
            in_member=sc1.nextLine();
            System.out.print("Date of borrowed - ");
            in_date=sc1.nextLine();
            Borrow borrow1=new Borrow(in_name,in_isbn,in_member,in_date);
            FileWriter fileWriter1=new FileWriter("borrowed.txt",true);
            fileWriter1.write(in_name+"\n"+in_isbn+"\n"+in_member+"\n"+in_date);
            fileWriter1.close();
            System.out.print("Do you want to enter data? (enter 1 to accept or any number to reject) - ");
            choice1=sc1.nextInt();
            }
            System.out.println("Data saved!!");
        } catch (Exception e) {
            
        }


    }
}
