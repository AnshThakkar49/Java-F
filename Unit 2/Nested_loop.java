import java.util.*;
public class Nested_loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        //To Find Max aamong a,b,c
        System.out.print("Enter A: ");
        a=sc.nextInt();
        System.out.print("Enter B: ");
        b=sc.nextInt();
        System.out.print("Enter C: ");
        c=sc.nextInt();
        if (a>b)
        {
            if (b>c) 
            {
                System.out.println(a+" is Maximum");            
            }
            else
            {
                System.out.println(c+" is MAximum");
            }
        }
        else 
        {
            if (b>c) 
            {
                System.out.println(b+" is Maximum");    
            }
            else
            {
                System.out.println(c+" is MAximum");
            }                        
        }
    }
}
