import java.util.*;
class simple{
	public static void main(String args[]){
	int f=0,s=1,temp,i;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no of terms:");
	int n=sc.nextInt();
	for(i=0;i<n;i++){
		System.out.println(+f);
		temp=f;
		f=s;
		s=temp+s;
	}
}}