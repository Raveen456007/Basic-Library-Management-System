import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
public class checkAvailability  {
    public void execution(){
        int choice4=0;
        String name,line_1,line_2,line_3=null,line_4,line_5,line_6,line_7,line_8,line_9,line_1x=null,line_10;
        boolean comp=false;
        Scanner scanner1=new Scanner(System.in);
        System.out.print("\nEnter the name of the book - ");
        name=scanner1.nextLine();
        try {
           // boolean comp2;
            BufferedReader bufferedReader=new BufferedReader(new FileReader("borrowed.txt"));
            while ((line_1=bufferedReader.readLine())!=null) {
                comp=name.equals(line_1);
                if (comp==true) {
                    line_2=bufferedReader.readLine();
                    line_3=bufferedReader.readLine();
                    line_4=bufferedReader.readLine();
                    //System.out.println("\nBorrowed");
                    break;
                }   
            }
            if (comp==true) {
                System.out.println("\n**Borrowed**");
                //line_3
                System.out.print("Do you want more information? (enter 1 to accept or any number to reject) - ");
                choice4=scanner1.nextInt();
                if(choice4==1){
                    System.out.print("Enter 1 - Borowed member\n"+"Enter 2 -  Book details\n"+"Choice - ");
                    choice4=0;
                    choice4=scanner1.nextInt();
                    if(choice4==1){
                        //line_3
                        BufferedReader bufferedReader2=new BufferedReader(new FileReader("member_details.txt"));
                        while((line_1=bufferedReader2.readLine())!=null) {
                            comp=line_3.equals(line_1);
                            if (comp==true) {
                                line_5=bufferedReader2.readLine();
                                line_6=bufferedReader2.readLine();
                                line_7=bufferedReader2.readLine();
                                line_8=bufferedReader2.readLine();
                                line_9=bufferedReader2.readLine();
                                System.out.println("Name - "+line_5+"\nAddress - "+line_6+"\nContact number - "+line_7+"\nEmail - "+line_8+"\nDate of registered - "+line_9);
                                break;
                            }   
                        }
                    }
                    else if(choice4==2){
                        BufferedReader bufferedReader2=new BufferedReader(new FileReader("AllResources.txt"));
                        while ((line_1x=bufferedReader2.readLine())!=null) {
                            comp=line_1.equals(line_1x);
                            if (comp==true) {
                                line_5=bufferedReader2.readLine();
                                line_6=bufferedReader2.readLine();
                                line_7=bufferedReader2.readLine();
                                line_8=bufferedReader2.readLine();
                                line_9=bufferedReader2.readLine();
                                line_10=bufferedReader2.readLine();
                                System.out.println("ISBN - "+line_5+"\nYear - "+line_6+"\nPublication - "+line_7+"\nPrice - "+line_8+"\nAuthor - "+line_9+"\nType - "+line_10);
                                break;
                            }   
                        }

                    }
                    else{
                        System.out.println("ERROR!!");
                    }
                }
                else{
                    System.out.println("\nThank you!!");
                }
            }
            else{
                System.out.println("\n**not borrowed**");
            }
            //System.out.println("\nNot borrowed!!");
           } catch (Exception e) {
            e.printStackTrace();
           }
    }
}
 class file_printing extends checkAvailability {
    static void file_printing2(){
        
    }
    
}


