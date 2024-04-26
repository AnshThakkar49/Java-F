//6-03-2024
//Method Without Argument Without Return Type
import java.util.*;
public class Method_Add
{
    public static void add()
    {
        Scanner sc = new Scanner(System.in); 
        int a,b;
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enter B: ");
        b=sc.nextInt();
        System.out.println("Summation is: "+(a+b));
    }
    public static void main(String[] args) 
    {
        add();
        System.out.println("Bye Bye!!");        
    }    
}