//Write a java program whch finds min no. among two no. using conditional oprator
import java.util.*;
public class Min 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min;
        System.out.println("Enter A: ");
        a=sc.nextInt();
        System.out.println("Enter B: ");
        b=sc.nextInt();
        min=(a<b)?a:b;
        System.out.println("Minimum Among "+a+" & "+b+" is: "+min);
    }
}