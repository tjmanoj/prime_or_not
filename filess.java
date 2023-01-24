import java.util.*;
import java.io.*;
class filess{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fn=sc.nextLine();
        File f=new File(fn);
        if(f.createNewFile()){
            System.out.println("File created"+f.getAbsolutePath());
        }
        else
            System.out.println("File Already Exists");
        int ch=0;
        while(ch!=5){
            System.out.println("Enter choice");
            ch=sc.nextInt();
            if(ch==1){
                Scanner scan=new Scanner(f);
                while(scan.hasNextLine())
                    System.out.print(scan.nextLine());
            }
            else if(ch==2){
                sc.nextLine();
                FileWriter fw=new FileWriter(f);
                System.out.println("Enter sentence:");
                String str=sc.nextLine();
                fw.write(str);
                fw.close();
            }
            else if(ch==3){
                sc.nextLine();
                FileWriter fw=new FileWriter(f,true);
                System.out.println("Enter sentence:");
                String str=sc.nextLine();
                fw.write(str);
                fw.close();
            }
            else if(ch==4){
                if(f.delete())
                    System.out.println("File Deleted:");
                else   
                    System.out.println("Not");
            }
        }
    }
}