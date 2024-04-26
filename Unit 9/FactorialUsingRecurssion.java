import java.util.Scanner;

public class FactorialUsingRecurssion 
{
    static int Fact(int n)
    {
        if (n==1) 
        {
            return 1;            
        }
        else
        {
            return (n*Fact(n-1));
        }
    }    
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");   
        a = sc.nextInt();
        System.out.println("Factorial of "+a+" is "+Fact(a));     
    }
}