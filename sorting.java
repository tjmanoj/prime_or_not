import java.util.*;
class sorting{
    public static void main(String[] args){
    int n,i;
    Scanner sc=new Scanner(System.in); 
    System.out.print("Enter the number of elements:");  
    n=sc.nextInt(); 
    int[] arr = new int[10];  
    System.out.println("Enter the elements of the array: ");  
    for(i=0; i<n; i++)  
     arr[i]=sc.nextInt();
    System.out.println("Unsorted array ");  
    for (i=0; i<n; i++)  
     System.out.println(arr[i]);
    bubble(arr,n);
    System.out.print("Bubble Sorted array: \n");
    for(i= 0; i <n; i++)  
         System.out.println(+arr[i]);
    insertion(arr,n);
    System.out.print("Insertion Sorted array: \n");
    for(i= 0; i <n; i++)  
         System.out.println(+arr[i]);
}  
public static void bubble(int arr[], int n){
    int i,j,t;
    for(i=0;i<n;i++)
     for(j=i+1;j<n;j++){
        if(arr[i]<arr[j]){
         t=arr[i];
         arr[i]=arr[j];
         arr[j]=t;
        }
}}
public static void insertion(int arr[],int n){
    int i,j,key;
	for(i=1;i<n;i++){
		key=arr[i];
		j=i-1;
		while (j >= 0 && arr[j] > key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
}}}  