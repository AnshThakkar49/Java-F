public class NestedTry_Example 
{
    public static void main(String[] args) 
    {
        try
        {
            int[] a = {1,2,3};
            System.out.println(a[1]);
            try
            {
                int x = a[1]/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.toString());
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
    }    
}