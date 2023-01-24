import java.util.*;
class search{
    public static void main(String args[]){
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nmber of elements:");
        n=sc.nextInt();
        int[]arr=new int[10];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
         arr[i]=sc.nextInt();
        System.out.println("Array Elements:\n");
        for(i=0;i<n;i++)
         System.out.println(+arr[i]);
        System.out.print("Enter search term:");
        int s=sc.nextInt();
        linear(arr,n,s);
        System.out.print("Enter search term:");
        int s1=sc.nextInt();
        binary(arr,n,s1);
    }
public static void linear(int arr[],int n,int s){
    int t=0;
    for(int i=0;i<n;i++){
     if(arr[i]==s){
      System.out.println("Element found at index "+(i+1));
      t=1;
     break;}}
     if(t==0)
      System.out.println("Element not found\n");
}
public static void binary(int arr[],int n,int s1){
    int st=0,sp=n-1,mid,i,j,t,temp=0;
    for(i=0;i<n;i++)
     for(j=i+1;j<n;j++){
         if(arr[i]>arr[j]){
             t=arr[i];
             arr[i]=arr[j];
             arr[j]=t;
         }
     }
    for(i=0;i<n;i++){
        mid=(st+sp)/2;
        if(s1==arr[mid]){
         System.out.println("Element found at index "+(mid+1));
         temp=1;
         break;}
        else if(s1 < arr[mid])
         sp=mid-1;
        else
         st=mid+1;
}
if(temp==0)
    System.out.println("Element not found");
}}