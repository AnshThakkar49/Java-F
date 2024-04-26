import java.util.*;
public class Calc 
{
    public static void main(String[] args) 
    {
        int a, b;
        String choice;
        char s;
        Scanner sc= new Scanner(System.in);
        System.out.println("1.For Addition Enter +\n2.For Subraction Enter -\n3.For Mutilication Enter *\n4.For Divison Enter /");
        System.out.print("Enter Your Choice: ");
        choice=sc.next();
        System.out.println("Enter Value of A and B Respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        s=choice.charAt(0);
        switch (s) 
        {
            case '+':
                System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of "+a+" & "+b+" is "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of "+a+" & "+b+" is "+(a*b));
                break;
            case '/':
                System.out.println("Division of "+a+" & "+b+" is "+(a/b));
                break;        
            default:
                System.out.println("Enter Valid Input");
                break;
        }
        System.out.println("Bye Bye!!");       
    }    
}