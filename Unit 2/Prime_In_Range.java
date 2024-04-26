import java.util.*;
public class Prime_In_Range 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int l,u,f;
        System.out.print("Enter Lower Limit: ");
        l=sc.nextInt();
        System.out.print("Enter Upper Limit: ");
        u=sc.nextInt();
        System.out.print("Prime Numbers are: ");
        for (int i = l; i <= u; i++)
        {   
            if (i!=1)
            {
                f=0;
                for (int j = 2; j < i; j++)
                {
                    if (i%j==0)
                    {
                        f=1;
                        break;
                    }            
                }
                if(f==0)
                {
                    System.out.print(i+" ");
                }
            }
        }        
    }   
}