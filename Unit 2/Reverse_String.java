//01/03/2024
import java.util.*;
public class Reverse_String 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        b="";
        int length;
        System.out.print("Enter Your String: ");
        a=sc.next();
        length=a.length();        
        System.out.print("Reversed String is: ");
        for (int i = length-1; i>=0; i--) 
        {
            b=b+(a.charAt(i));
        }
        System.out.println(b);
        if (a.equals(b)) //Because String is not a primitvve data type in java
        {
            System.out.println(a+" is Palindrome String");
        }
        else
        {
            System.out.println(a+" is not a Palindrome String");
        }
    }
}
