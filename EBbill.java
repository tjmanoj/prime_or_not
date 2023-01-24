import java.util.*;
class EBbill {
    public static void main(String[] args) {
        int units;
        double amt,fp,tot;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the units consumed:");
        units=sc.nextInt();
        if(units<=100){
            amt=0;fp=0;}
        else if(units>100 && units<=200){
            amt=(units-100)*1.5;fp=10;}
        else if(units>200 && units<=500){
            amt=(100*2)+((units-200)*3);fp=30;}
        else{
            amt=(100*3.5)+(300*4.6)+((units-500)*6.6);fp=50;}
        tot=amt+fp;
        System.out.println(+tot);
    }}