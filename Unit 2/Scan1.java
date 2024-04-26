//23-02-2024
import java.util.*;
public class Scan1 {

    public static void main(String[] args) 
    { 
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int a, b, sum, mul, sub;
        double div;
        System.out.print("Enter First Integer: ");
        a=sc.nextInt();
        System.out.print("Enter Second Integer: ");
        b=sc.nextInt();
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=(double)a/(double)b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
        System.out.println("Subtraction of "+a+" and "+b+" is "+sub);
        System.out.println("Multilication of "+a+" and "+b+" is "+mul);
        System.out.println("Division of "+a+" and "+b+" is "+div);
    }
}
