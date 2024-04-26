//06-03-2024
//Method Without Argument With Return Type
import java.util.*;
public class Add_Type3 
{
    public static int add()    
    {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enetr B: ");
        b=sc.nextInt();
        sum=a+b;
        return sum;
    }    
    public static void main(String[] args) 
    {
        System.out.println("Summation is: "+add());
        System.out.println("Bye Bye!!");        
    }
}