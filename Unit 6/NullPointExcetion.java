public class NullPointExcetion 
{
    public static void main(String[] args) 
    {
        /*
        String s = null;
        try
        {
            System.out.println(s.length()); 
        } 
        catch (NullPointerException obj)
        {
            System.out.println("Enter String");
            System.out.println(obj.toString());
        }             
        finally
        {
            System.out.println("BYE BYE");
        }
        */
        String s = "Hello";
        try 
        {
            System.out.println(s.charAt(5));
        } 
        catch (StringIndexOutOfBoundsException obj) 
        {
            System.out.println(obj.toString());
        }
        finally
        {
            System.out.println("BYE BYE");
        }
    }    
}