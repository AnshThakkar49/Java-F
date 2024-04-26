import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int a = sc.nextInt();
            System.out.println(a/0);
        }
        /*catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        catch(InputMismatchException f)
        {
            System.out.println(f.toString());
        }*/
        catch(ArithmeticException|InputMismatchException e)
        {
            System.out.println(e.toString());
        }
    }
}
