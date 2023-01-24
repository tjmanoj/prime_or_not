import java.util.*;
import java.io.*;
class add<T>{
    T n1;
    T n2;
    add(T n1,T n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void addition(){
        if(n1 instanceof Integer && n2 instanceof Integer)
            System.out.println((Integer)n1+(Integer)n2);
        else if(n1 instanceof Double && n2 instanceof Double)
            System.out.println((Double)n1+(Double)n2);
    }
}
class generic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        add<Integer> obj =new add<Integer>(5,5);
        obj.addition();
        add<Double> obj2 =new add<Double>(5.5,4.50);
        obj2.addition();
    }
}