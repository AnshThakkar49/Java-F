import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatchDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);      
        try 
        {
            int a  = sc.nextInt();
            System.out.println(a);
        } 
        catch (InputMismatchException obj) 
        {
            System.out.println(obj.toString());
        }
        finally
        {
            System.out.println("BYE BYE");
        }
    }
    
}