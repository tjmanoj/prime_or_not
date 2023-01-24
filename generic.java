package generic;
import java.util.*;
class generics{
	public static <T extends Comparable<T>>T max(List<T> list){
	T temp=list.get(0);
			for(T element: list)
				if(element.compareTo(temp) > 0)
						temp=element;
	return temp;
}}
public class maximum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		List<Integer> myint = new ArrayList<Integer>();
		System.out.println("Enter no.of integers:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
				myint.add(sc.nextInt());
		List<Double> mydouble = new ArrayList<Double>();
		System.out.println("Enter no.of doubles:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
				mydouble.add(sc.nextDouble());
		List<Character> mychar = new ArrayList<Character>();
		System.out.println("Enter no.of characters:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
				mychar.add(sc.next().charAt(0));
		System.out.println("Maximum integer:"+generics.max(myint)+"\nMaximum double:"+generics.max(mydouble)+"\nMaximum character:"+generics.max(mychar));
		
	}
}
