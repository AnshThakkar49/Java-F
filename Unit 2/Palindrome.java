import java.util.*;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int temp,n,rem,rev;
        rev=0;
        System.out.print("Enter Number: ");
        n=sc.nextInt();
        temp=n;
        while (temp!=0) 
        {
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;            
        }       
        if (rev==n) 
        {
            System.out.println(n+" is a Palindrome Number");            
        }
        else
        {
            System.out.println(n+" is not a Paindrome Number");
        }
    }
    
}
