import java.util.*;
public class Prime_loop 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);      
        int a,f;
        System.out.print("Enter Number: ");
        a=sc.nextInt(); 
        f=0;
        if (a!=1) 
        {          
            for (int i = 2; i < a; i++) 
            {
                if (a%i==0) 
                {
                    f=1;   
                    break;             
                }
                
            } 
            if (f==1) 
            {
                System.out.println("It is not a Prime Number");
            }
            else
            {
                System.out.println("It is a Prime Number");
            }
        }
        else
        {
            System.out.println("1");
        }
    }
}