public class ArrayE 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[5];
        try 
        {
            arr[5] = 5;             
        } 
        catch (ArrayIndexOutOfBoundsException obj) 
        {
            System.out.println(obj.toString());
        }
        finally
        {
            System.out.println("BYE BYE");
        }               
    }    
}