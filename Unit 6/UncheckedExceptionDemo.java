import java.util.*;
public class UncheckedExceptionDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        int a , b;
        try 
        {
            System.out.println("Enter Value of A & B Respectivey: ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("A/B = "+(a/b));    
        } 
        catch(ArithmeticException obj) 
        {
            System.out.println("Enter Any Other Number");   
            System.out.println(obj.toString());  
        }
        finally                 
        {
            //This Block Will Execute For Sure
            System.out.println("BYE BYE");
        }        
    }
}