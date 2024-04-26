public class ThrowsKeyword
{
    static void divide() throws ArithmeticException
    {
        int x,y,z;
        x=10;
        y=0;
        try
        {
            z=x/y;
            System.out.println("Division: "+z);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Catch Block In Divide");
            throw obj;
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            divide();
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Catch Block in Main");
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("BYE BYE!!!");
        }
    }
}