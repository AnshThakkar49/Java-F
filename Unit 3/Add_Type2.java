//06-03-2024
//Method With Argument Without Return Type
import java.util.Scanner;

public class Add_Type2 
{
    public static void add(int a, int b)
    {
        System.out.println("Summaton is: "+(a+b));   
    }
    public static void main(String[] args) 
    {
        int c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C: ");
        c=sc.nextInt();
        System.out.print("Enter D: ");
        d=sc.nextInt();
        add(c,d);
    }    
}