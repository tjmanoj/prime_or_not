import java.util.*;
interface Prime{
    void test(int n);
}
class Test implements Prime{
    public void test(int n){
        int i,count=0;
        for(i=0;i<n;i++)
            if(n%2==0)
                count++;
        if(count==2)
            System.out.println("Prime");
        else  
            System.out.println("Not Prime");
    }
}
Class Sample{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.test(5);
    }
}