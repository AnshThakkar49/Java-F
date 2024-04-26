//06-03-2024
//Method With Argument With Return Type
import java.util.*;
public class Add_Type4
{
    public static int add(int a, int b)    
    {
        int sum;
        sum=a+b;
        return sum;
        //return(a+b);
    }
    public static void main(String[] args) 
    {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enetr B: ");
        b=sc.nextInt();
        System.out.println("Summation is: "+add(a,b));
        System.out.println("Bye Bye!!");        
    }
}