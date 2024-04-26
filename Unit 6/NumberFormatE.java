public class NumberFormatE 
{
    public static void main(String[] args) 
    {
        String s = "ABC";
        try 
        {
            int n = Integer.parseInt(s);
            System.out.println(n);
            
        } 
        catch (NumberFormatException obj) 
        {
            System.out.println(obj.toString());
        }        
        finally
        {
            System.out.println("Bye Bye");
        }
    }
    
}
