class student2 {
   String name,DOB,address;
   int age,phone;
   {
    System.out.println("Block created!!");
   }
   student2(String name,String DOB,String address,int age){
    this.name=name;
    this.DOB=DOB;
    this.address=address;
    this.age=age;
   }
   student2(int phone){
    this.phone=phone;
   }
}
public class student {
    public static void main(String[] args) {
        student2 s1=new student2("Jhonn", "2005-02-15", "California", 20);
        student2 s2=new student2(778733391);
    }
}


