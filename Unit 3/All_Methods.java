import java.util.*;
public class All_Methods 
{
    public static void sub()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enter B: ");
        b=sc.nextInt();
        System.out.println("Subtraction is: "+(a-b));
    }
    public static void add(int a, int b )
    {
        System.out.println("Additon is: "+(a+b));
    }
    public static int mul()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enter B: ");
        b=sc.nextInt();
        return (a*b);        
    }
    public static int div(double a, double b)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextDouble();
        System.out.print("Enter B: ");
        b=sc.nextDouble();
        return(a/b);
    }
    public static void main(String[] args) 
    {
        sub();
        System.out.println("Multiication is: "+mul());
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enetr B: ");
        b=sc.nextInt();
        add(a,b);        
        System.out.println("Division is: "+div(a,b));
        System.out.println("Bye Bye!!");        
    }    
}