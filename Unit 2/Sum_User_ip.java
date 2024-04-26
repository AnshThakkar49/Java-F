import java.util.*;
public class Sum_User_ip 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,sum; 
        sum=0;   
        System.out.println("Enter 0 To Terminate");   
        do
        {
            System.out.println("Enter Input: ");
            i=sc.nextInt();
            sum=sum+i;
        }while(i!=0);
        System.out.println("Summation of Your Inputs is: "+sum);
    }
}
