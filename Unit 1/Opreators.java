import java.util.*;
public class Opreators 
{
    public static void main(String[] args) 
    {   
        int a,b,c,sum, sum1;
        a=10;
        b=3;
        c=1;
        sum=a-(++c)-(--b);
        sum1=a-(++c)-(b--);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println("a: "+a+", b: "+b+", c:"+c);        
    }

}
