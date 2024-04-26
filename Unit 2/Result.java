import java.util.*;
public class Result
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter -1 to Exit");
        System.out.print("Enter Marks: ");
        marks=sc.nextInt();        
        while (marks!=-1) 
        {       
            if (marks<100) 
            {   
                if (marks>=90) 
                {
                    System.out.println("A");           
                }
                else if (marks>=80) 
                {
                    System.out.println("B");           
                }
                else if (marks>=70) 
                {
                    System.out.println("C");           
                }
                else if (marks>=60) 
                {
                    System.out.println("A");           
                }
                else if (marks<35) 
                {
                    System.out.println("Fail");           
                }
                else
                {
                    System.out.println("Enter Valid Input");
                }
            }
            else
            {
                System.out.println("Enter Valid Input");
            }  
        }
    }
}