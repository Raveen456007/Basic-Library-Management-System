import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
public class Administrator {
    private static String password()
    {
        String pass="007crack";
        return pass;
    }
    protected void layer()
    {
      int count6=1;
      String data2;
        data2=password();
        int count=0;
        Scanner s2=new Scanner(System.in);
        System.out.println("\nWelcome to Administrator");
        String data;
        System.out.print("Enter the password - ");
        data=s2.nextLine();
        boolean compare = data.equals(data2);
        while(compare==false)
        {
            System.out.println("ERROR!!! Try again!!");
            System.out.print("Enter the password - ");
            data=s2.nextLine();
            count++;
            compare = data.equals(data2);
        }
        if(count>5)
        {
            System.out.println("COUNT NUMBER HAS EXEEDED!!");
        }
        else
        {
           while (count6==1) {
            System.out.println("Enter 1 - Resource management\n"+"Enter 2 - Memberships\n"+"Enter 3 - To Exit\n");
            int choice2=0;
            choice2=s2.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("**Welcome to the Resource management**");
                    System.out.println("Enter 1 - To add info\n"+"Enter 2 - To Update and search info\n"+"Enter 3 - To check the availablity\n"+"Enter 4 - Borrow books\n");
                    System.out.print("Choice - ");
                    int choice3=s2.nextInt();
    
    
                    switch (choice3) {
                        case 1:
                            book_inserter();
                            break;
                        case 2:
                        info_updater up1=new info_updater();
                        up1.updater();
                            break;
                        case 3:
                        checkAvailability ck=new checkAvailability();
                        ck.execution();
                        break;
                        case 4:
                        Borrow.process3();
                            break;
                    
                        default:
                        System.out.println("ERROR Try again!!");
                            break;
                    }
                    break;
                case 2:
                System.out.println("**Welcome to the membership updater**\n"+"Enter 1 - To add new members and pay memberships\n"+"Enter 2 - To search details\n"+"Enter 3 - To renew the membership");
                System.out.print("Enter 4 - To Enter fines data"+"\nChoice - ");
                choice2=s2.nextInt();
                switch (choice2) {
                  case 1:
                  members.processes();  //Adding new members 
                    break;
                  case 2:
                  process2_hide proc=new process2_work();
                  proc.process2();//Searching the members
                    break;
                  case 3:
                  RenewMember RW=new RenewMember();
                  RW.calculation();
                    break;
                  case 4:
                    fineData f1=new fineData();
                    f1.process4();
                    //for now entering data!!
                    break; 
                
                  default:
                  System.out.println("ERROR!!");
                    break;
                }
                    break;
                case 3:
                    break; 
                default:
                System.out.println("ERROR!");
                    break;
            }
            System.out.print("Do you want to continue>\n"+"Press 1 to accept or any number to rejeject - ");
            count6=s2.nextInt();
           }
           System.out.println("\nThank you!!");
        }
        
    }
    public static void book_inserter () {
         Books list[]=new Books[100];//testing purposes only!!!
         Books b1=new Books();
         int count2=0;
         while(count2<100) {
            Scanner s5=new Scanner(System.in);
            System.out.print("Do you want to enter more data ? (press 1 to accept or any number to reject)\n"+"choice - ");
            int choice3=s5.nextInt();
            if(choice3==1)
            {
              Scanner s4=new Scanner(System.in);
              System.out.print("Name - ");
              String Aname=s4.nextLine();
              System.out.print("ISBN - ");
              String AISBN=s4.nextLine();
              System.out.print("Year - ");
              String Ayear=s4.nextLine();
              System.out.print("Publisher - ");
              String Apublisher=s4.nextLine();
              System.out.print("Price - ");
              double Aprice=s4.nextDouble();
              System.out.print("Author - ");
              String Aauthor=s4.nextLine();
              Aauthor=s4.nextLine();
              System.out.print("Status(b-borrowed and nb-not borrowed) - ");
              String Status=s4.nextLine();
              System.out.println("Type of the resource");
              System.out.print("(Enter B-book, mag-magazine,news - newspaper,jou - journals) - ");
              String Type=s4.nextLine(); 
              boolean com1=Type.equals("book");
              boolean com2=Type.equals("mag");
              boolean com3=Type.equals("news");
              boolean com4=Type.equals("jou");
              b1.name=Aname;
              b1.ISBN=AISBN;
              b1.year=Ayear;
              b1.publisher=Apublisher;
              b1.price=Aprice;
              b1.Author=Aauthor;
              b1.status=Status;
              b1.type=Type;
              list[count2]=b1;
              if(com1==true) {
                File f1=new File("Book_info.txt");
                try{
                  FileWriter FM=new FileWriter("AllResources.txt",true);
                  FileWriter fw=new FileWriter("Book_info.txt",true);
                  FileWriter fw5=new FileWriter("All_book_names.txt", true);
                  fw5.write(list[count2].name+"\n");
                  FileWriter fw6=new FileWriter("All_isbn.txt",true);
                  fw6.write(list[count2].ISBN+"\n");
                  FileWriter fw7=new FileWriter("All_year.txt",true);
                  fw7.write(list[count2].year+"\n");
                  FileWriter fw8=new FileWriter("All_pub.txt",true);
                  fw8.write(list[count2].publisher+"\n");
                  FileWriter fw9=new FileWriter("All_price.txt",true);
                  fw9.write(list[count2].price+"\n");
                  FileWriter fw10=new FileWriter("All_authors.txt",true);
                  fw10.write(list[count2].Author+"\n");
                  FileWriter fw11=new FileWriter("status.txt",true);
                  fw11.write(list[count2].status+"\n");
                  FileWriter fw12=new FileWriter("rType.txt",true);
                  fw12.write(list[count2].type+"\n");
                  fw5.close();
                  fw6.close();
                  fw7.close();
                  fw8.close();
                  fw9.close();
                  fw10.close();
                  fw11.close();
                  fw12.close();
                  fw.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  FM.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  fw.close();
                  FM.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
              }
              else if(com2==true){
                File f2=new File("magazine_info.txt");
                try{
                  FileWriter FM=new FileWriter("AllResources.txt",true);
                  FileWriter fw2=new FileWriter("magazine_info.txt",true);
                  FileWriter fw5=new FileWriter("All_book_names.txt", true);
                  fw5.write(list[count2].name+"\n");
                  FileWriter fw6=new FileWriter("All_isbn.txt",true);
                  fw6.write(list[count2].ISBN+"\n");
                  FileWriter fw7=new FileWriter("All_year.txt",true);
                  fw7.write(list[count2].year+"\n");
                  FileWriter fw8=new FileWriter("All_pub.txt",true);
                  fw8.write(list[count2].publisher+"\n");
                  FileWriter fw9=new FileWriter("All_price.txt",true);
                  fw9.write(list[count2]+"\n");
                  FileWriter fw10=new FileWriter("All_authors.txt",true);
                  fw10.write(list[count2].Author+"\n");
                  FileWriter fw11=new FileWriter("status.txt",true);
                  fw11.write(list[count2].status+"\n");
                  FileWriter fw12=new FileWriter("rType.txt",true);
                  fw12.write(list[count2].type+"\n");
                  fw5.close();
                  fw6.close();
                  fw7.close();
                  fw8.close();
                  fw9.close();
                  fw10.close();
                  fw11.close();
                  fw12.close();
                  fw2.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  FM.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  fw2.close();
                  FM.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
              }
              else if(com3==true){
                File f3=new File("news_paper.txt");
                try{
                  FileWriter FM=new FileWriter("AllResources.txt",true);
                  FileWriter fw3=new FileWriter("news_paper.txt",true);
                  FileWriter fw5=new FileWriter("All_book_names.txt", true);
                  fw5.write(list[count2].name+"\n");
                  FileWriter fw6=new FileWriter("All_isbn.txt",true);
                  fw6.write(list[count2].ISBN+"\n");
                  FileWriter fw7=new FileWriter("All_year.txt",true);
                  fw7.write(list[count2].year+"\n");
                  FileWriter fw8=new FileWriter("All_pub.txt",true);
                  fw8.write(list[count2].publisher+"\n");
                  FileWriter fw9=new FileWriter("All_price.txt",true);
                  fw9.write(list[count2]+"\n");
                  FileWriter fw10=new FileWriter("All_authors.txt",true);
                  fw10.write(list[count2].Author+"\n");
                  FileWriter fw11=new FileWriter("status.txt",true);
                  fw11.write(list[count2].status+"\n");
                  FileWriter fw12=new FileWriter("rType.txt",true);
                  fw12.write(list[count2].type+"\n");
                  fw5.close();
                  fw6.close();
                  fw7.close();
                  fw8.close();
                  fw9.close();
                  fw10.close();
                  fw11.close();
                  fw12.close();
                  fw3.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  FM.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  fw3.close();
                  FM.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
              }
              else if(com4==true){
                File f4=new File("journals.txt");
                try{
                  FileWriter FM=new FileWriter("AllResources.txt",true);
                  FileWriter fw4=new FileWriter("journals.txt",true);
                  FileWriter fw5=new FileWriter("All_book_names.txt", true);
                  fw5.write(list[count2].name+"\n");
                  FileWriter fw6=new FileWriter("All_isbn.txt",true);
                  fw6.write(list[count2].ISBN+"\n");
                  FileWriter fw7=new FileWriter("All_year.txt",true);
                  fw7.write(list[count2].year+"\n");
                  FileWriter fw8=new FileWriter("All_pub.txt",true);
                  fw8.write(list[count2].publisher+"\n");
                  FileWriter fw9=new FileWriter("All_price.txt",true);
                  fw9.write(list[count2]+"\n");
                  FileWriter fw10=new FileWriter("All_authors.txt",true);
                  fw10.write(list[count2].Author+"\n");
                  FileWriter fw11=new FileWriter("status.txt",true);
                  fw11.write(list[count2].status+"\n");
                  FileWriter fw12=new FileWriter("rType.txt",true);
                  fw12.write(list[count2].type+"\n");
                  fw5.close();
                  fw6.close();
                  fw7.close();
                  fw8.close();
                  fw9.close();
                  fw10.close();
                  fw11.close();
                  fw12.close();
                  fw4.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  FM.write(list[count2].name+"\n"+list[count2].ISBN+"\n"+list[count2].year+"\n"+list[count2].publisher+"\n"+list[count2].price+"\n"+list[count2].Author+"\n"+list[count2].type+"\n"+list[count2].status+"\n");
                  fw4.close();
                  FM.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
              }
              else{
                System.out.println("ERROR!! re-enter the details with a correct type!!");
              }
              count2++;
            }
            else {
                System.out.println("Thank you");
                break;
            }
              
         }
    }
}

