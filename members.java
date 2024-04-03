import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
public class members {
    private String mem_id;
    private String mem_name;
    private String address;
    private int contact;
    private String mail;
    private String date_of_resgistered;
    private double Camount_p,Cbalance;
    private String Ccard_no,Cbill_no;
     
    members(String mem_id,String mem_name,String address,int contact,String mail,String date_of_resgistered,double Camount_p,double Cbalance,String Ccard_no,String Cbill_no){
        this.mem_id=mem_id;
        this.mem_name=mem_name;
        this.address=address;
        this.contact=contact;
        this.mail=mail;
        this.date_of_resgistered=date_of_resgistered;
        this.Camount_p=Camount_p;
        this.Cbalance=Cbalance;
        this.Ccard_no=Ccard_no;
        this.Cbill_no=Cbill_no;
    }
    static void processes(){
        processes1();
    }
    public static void processes1(){
        int count5=0;
        int choice5=0;
        System.out.print("Do you want to enter data?\n"+"(Enter 1 to accept or any number to reject) - ");
        Scanner scann=new Scanner(System.in);
        choice5=scann.nextInt();
        while (choice5==1) {
            String ID,name,address,mail,card_no,bill_no;
            int con;
            double amount_p,balance;
            String date_reg;
            System.out.print("Member ID - ");
            ID=scann.nextLine();
            ID=scann.nextLine();
            System.out.print("Mmeber name - ");
            name=scann.nextLine();
            System.out.print("Address - ");
            address=scann.nextLine();
            System.out.print("Contact - ");
            con=scann.nextInt();
            System.out.print("Mail - ");
            mail=scann.nextLine();
            mail=scann.nextLine();
            System.out.print("Registered date - ");
            date_reg=scann.nextLine();
            System.out.print("Card number - ");
            card_no=scann.nextLine();
            System.out.print("Bill number - ");
            bill_no=scann.nextLine();
            System.out.print("Paid amount - ");
            amount_p=scann.nextDouble();
            balance=amount_p-2500;
            members m1=new members(ID, name, address, con, mail, date_reg,amount_p,balance,card_no,bill_no);
            try {
                FileWriter mem_file=new FileWriter("member_details.txt",true);
                FileWriter paid_d=new FileWriter("paidDetails.txt",true);
                mem_file.write(m1.mem_id+"\n");
                mem_file.write(m1.mem_name+"\n");
                mem_file.write(m1.address+"\n");
                mem_file.write(m1.contact+"\n");
                mem_file.write(m1.mail+"\n");
                mem_file.write(m1.date_of_resgistered+"\n");
                paid_d.write(m1.mem_id+"\n");
                paid_d.write(m1.Cbill_no+"\n");
                paid_d.write(m1.Ccard_no+"\n");
                paid_d.write(m1.Camount_p+"\n");
                paid_d.write(m1.Cbalance+"\n");
                mem_file.close();
                paid_d.close();
                
            } catch (Exception e) {
                e.printStackTrace();
        }
        System.out.println("\n***Membership paid details***\n"+"\nMember ID - "+m1.mem_id+"\nMember name - "+m1.mem_name+"\nAmount paid - "+m1.Camount_p+"\nMembership fee - RS.2500"+"\nBalance - "+m1.Cbalance+"\nBill number - "+m1.Cbill_no);
        System.out.print("Do you want to enter data?\n"+"(Enter 1 to accept or any number to reject) - ");
        choice5=scann.nextInt();
        //  MEMBER DETAILS ADDER............................
    }
}
}
abstract class process2_hide {
    abstract void process2();
}
 class process2_work extends process2_hide {
    void process2(){
        Scanner s12=new Scanner(System.in);
        System.out.print("Enter the member ID to search - ");
        String inID=s12.nextLine();
        String line=null;//Store the read line of the text
        String line2=null,line4=null,line5=null,line3=null,line6=null;
        boolean com;
        try {
            BufferedReader buff = new BufferedReader(new FileReader("member_details.txt"));
            while ((line = buff.readLine()) != null) {
                com=line.equals(inID);
                if (com==true) {
                    line2=buff.readLine();
                    line3=buff.readLine();
                    line4=buff.readLine();
                    line5=buff.readLine();
                    line6=buff.readLine();
                    System.out.println("Name - "+line2+"\nAddress - "+line3+"\nContact - "+line4+"\nMail - "+line5+"\nDate of registered - "+line6+"\n");
                    System.out.print("\nDo you want the paid details? (Enter 1 to accept or any number to reject) - ");
                    int choice6=s12.nextInt();
                    if(choice6==1){
                        paidFinder();
                    }
                    else{
                        //System.out.println("Name - "+line2+"\nAddress - "+line3+"\nContact - "+line4+"\nMail - "+line5+"\nDate of registered - "+line6+"\n");
                        System.out.println("\nThank You!!");
                    }
                    break;
                }
                else{
                    //System.out.println("Member did not found, Try again!!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
    public static void paidFinder(){
        String ln=null;//Store the read line of the text
        String l2=null,l4=null,l5=null,l3=null;
        boolean com2=false;
        Scanner s13=new Scanner(System.in);
        System.out.print("Enter the member ID again to search - ");
        String inI=s13.nextLine();
        try {
            BufferedReader buff2 = new BufferedReader(new FileReader("paidDetails.txt"));
        while ((ln = buff2.readLine()) != null) {
            com2=ln.equals(inI);
            if (com2==true) {
                l2=buff2.readLine();
                l3=buff2.readLine();
                l4=buff2.readLine();
                l5=buff2.readLine();
                break;
            }
        }
        if(com2==true){
            System.out.println("Bill number - "+l2+"\nCard number- "+l3+"\nPaid amount - "+l4+"\nBalance- "+l5+"\n");
        }
        else{
            System.out.println("Information did not found, Try again!!");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

   

