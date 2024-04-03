import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class info_updater{
    public void updater(){
        System.out.println("***Enter the details that wanted to update***");
        Scanner input=new Scanner(System.in);
        System.out.print("Name - ");
        String newName=input.nextLine();
        System.out.print("ISBN - ");
        String newISBN=input.nextLine();
        System.out.print("Year - ");
        String newYear=input.nextLine();
        System.out.print("Publisher - ");
        String newPublisher=input.nextLine();
        System.out.print("Price - ");
        String newPrice=input.nextLine();
        Scanner input3=new Scanner(System.in);//due to occuring of the errors
        System.out.print("Author - "); 
        //String newAuthor=input3.nextLine();
        String newAuthor2=input3.nextLine();
        System.out.print("Type - ");
        String newType=input3.nextLine();
        System.out.print("Status - ");
        String newStatus=input.nextLine();
        //temp_call t1=new temp_call();
        //t1.temp_call2();
        Scanner input2=new Scanner(System.in);//due to occuring of the errors
        System.out.print("Enter name of the book to update - ");
        //String findBook=input2.nextLine();
        String findBook2=input2.nextLine();
        try{
            String all_books[]=new String[100];
            String all_ISBN[]=new String[100];
            String all_price[]=new String[100];
            String all_pub[]=new String[100];
            String all_year[]=new String[100];
            String all_author[]=new String[100],typeString[]=new String[100],statuString[]=new String[100];
            String line=null;
            int lineNo=0;
            BufferedReader bu1=new BufferedReader(new FileReader("All_book_names.txt"));
            while((line = bu1.readLine()) != null){
                all_books[lineNo]=line;
                lineNo++;
            }
            BufferedReader bu2=new BufferedReader(new FileReader("All_isbn.txt"));
            lineNo=0;
            line=null;
            while((line = bu2.readLine()) != null){
                all_ISBN[lineNo]=line;
                lineNo++;
            }
            BufferedReader bu3=new BufferedReader(new FileReader("All_price.txt"));
            lineNo=0;
            line=null;
            while((line = bu3.readLine()) != null){
                all_price[lineNo]=line;
                lineNo++;
            }

            BufferedReader bu4=new BufferedReader(new FileReader("All_pub.txt"));
            lineNo=0;
            line=null;
            while((line = bu4.readLine()) != null){
                all_pub[lineNo]=line;
                lineNo++;
            }
            BufferedReader bu5=new BufferedReader(new FileReader("All_year.txt"));
            lineNo=0;
            line=null;
            while((line = bu5.readLine()) != null){
                all_year[lineNo]=line;
                lineNo++;
            }
            BufferedReader bu6=new BufferedReader(new FileReader("All_authors.txt"));
            lineNo=0;
            line=null;
            while((line = bu6.readLine()) != null){
                all_author[lineNo]=line;
                lineNo++;
            }
            BufferedReader bu7=new BufferedReader(new FileReader("rType.txt"));
            lineNo=0;
            line=null;
            while((line= bu7.readLine()) != null){
                typeString[lineNo]=line;
                lineNo++;
            }
            BufferedReader bu8=new BufferedReader(new FileReader("status.txt"));
            lineNo=0;
            line=null;
            while((line=bu8.readLine()) != null){
                statuString[lineNo]=line;
                lineNo++;
            }
            //TESING ......................................
            lineNo=0;
            while (all_books[lineNo]!= null) {
                System.out.println(all_books[lineNo]);
                lineNo++;
            }
            lineNo=0;
            while (all_ISBN[lineNo]!= null) {
                System.out.println(all_ISBN[lineNo]);
                lineNo++;
            }
            //testing ......................................
            //finding the data using the name////////
        int count3=0;
        boolean compare2;
        while(count3<100){
            compare2=findBook2.equals(all_books[count3]);
            if(compare2==true)
            {
                System.out.println("Book found!!");
                System.out.println("Book name - "+all_books[count3]+"\nISBN - "+all_ISBN[count3]+"\nPrice - "+all_price[count3]+"\nPublication - "+all_pub[count3]+"\n");
                System.out.println("\nYear - "+all_year[count3]+"\nAuthor - "+all_author[count3]+"\n");
                //System.out.println(all_books[count3]+"\n"+all_ISBN[count3]+"\n"+all_pub[count3]+"\n");
                System.out.println("Do you want update the entered data?");
                System.out.print("(press 1 to accept or any number to reject) - ");
                Scanner s9=new Scanner(System.in);
                int choice4=s9.nextInt();
                if(choice4==1){
                    System.out.println("UPDATED!!");
                    all_books[count3]=newName;
                    all_ISBN[count3]=newISBN;
                    all_price[count3]=newPrice;
                    all_pub[count3]=newPublisher;
                    all_year[count3]=newYear;
                    all_author[count3]=newAuthor2;
                    typeString[count3]=newType;
                    statuString[count3]=newStatus;
                    FileWriter file=new FileWriter("Updated_all_details.txt");
                    int count4=0;
                    while((all_books[count4]!=null) && (all_ISBN[count4]!=null) && (all_price[count4]!=null) && (all_pub[count4]!=null) && (all_year[count4]!=null)&&(all_author[count4]!=null)&&(typeString[count4]!=null)&&(statuString[count4]!=null)){
                        file.append("Name - "+all_books[count4]+"\n");
                        file.append("ISBN - "+all_ISBN[count4]+"\n");
                        file.append("Price - "+all_price[count4]+"\n");
                        file.append("Publication - "+all_pub[count4]+"\n");
                        file.append("Year - "+all_year[count4]+"\n");
                        file.append("Author - "+all_author[count4]+"\n");
                        file.append("Type - "+typeString[count4]+"\n");
                        file.append("Status - "+statuString[count4]+"\n");
                        count4++;
                    }
                    file.close();
                    break;
                }
            }
            else{
                System.out.println("ERROR!! BOOK IS NOT AVAILABLE TRY AGAIN!!");
            }
            count3++;
        }

        }
        catch(IOException e){
        e.printStackTrace();
       }
    }
}
