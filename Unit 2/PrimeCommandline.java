public class PrimeCommandline
{
    public static void main(String[] args) 
    {  
        int a,f;
        a=Integer.parseInt(args[0]); 
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
            System.out.println("Try Another Number");
        }
    }
}