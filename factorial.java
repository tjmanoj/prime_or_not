import java.util.*;
class simple{
	public static void main(String args[]){
	int fact=1,i;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int n=sc.nextInt();
	for(i=1;i<=n;i++){
	    fact*=i;
	}
	System.out.println(+fact);
}}