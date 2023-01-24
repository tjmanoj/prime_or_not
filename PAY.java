import java.util.*;
class Employee{
    String name,addr,email;long id,mob;double BP,HRA,PF,DA,SC,NS,GS;
    Scanner sc=new Scanner(System.in);
    public void read(){
        System.out.print("Enter Name,Address,Email,ID,Mobile No,Basic Pay\n");
        name=sc.nextLine();
        addr=sc.nextLine();
        email=sc.nextLine();
        id=sc.nextLong();
        mob=sc.nextLong();
        BP=sc.nextDouble();
   }
    public void compute(){
         HRA=0.1*BP;
         PF=0.12*BP;
         DA=0.97*BP;
         SC=0.01*BP;
         GS=BP+HRA+DA;
         NS=GS - (SC+PF);
         System.out.println("Name\t\t\t:"+name+"\nEmail\t\t\t:"+email+"\nAddress\t\t\t:"+addr+"\nID\t\t\t:"+id+"\nMobile\t\t\t:"+mob+"\nGross Salary\t\t:"+GS+"\nNet Salary\t\t:"+NS);
}}
class Programmer extends Employee{
    void Programmer(){
        super.read();
        System.out.println("Programmer Info\n");
        super.compute();
    }
}
class Professor extends Employee{
    void Professor(){
        super.read();
        System.out.println("Professor Info\n");
        super.compute();
    }
}
class Associate_Professor extends Employee{
    void Associate_Professor(){
        super.read();
        System.out.println("Associate Professor Info\n");
        super.compute();
    }
}
class Assistant_Professor extends Employee{
    void Assistant_Professor(){
        super.read();
        System.out.println("Assistant Professor Info\n");
        super.compute();
    }
}
class Payslip{
     public static void main(String[] args) {int ch=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("MENU\n1.Programmer 2.Professor 3.Associate Professor 4.Assistant Professor 5.Exit");
         while(ch!=5){
             System.out.print("Enter choice:");
             ch=sc.nextInt();
             if(ch==1){
                 Programmer p=new Programmer();
                 p.Programmer();}
            else if(ch==2){
                 Professor p=new Professor();
                 p.Professor();}
             else if(ch==3){
                 Associate_Professor p=new Associate_Professor();
                 p.Associate_Professor();}
             else if(ch==4){
                 Assistant_Professor p=new Assistant_Professor();
                 p.Assistant_Professor();}}}}

    