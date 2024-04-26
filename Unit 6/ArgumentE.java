class circle
{
    double radius;
    public circle(double r)
    {
        if (r>0) 
        {
            radius  = r;
        }
        else
        {
            throw new IllegalArgumentException("Negatve");
        }
    }
}
public class ArgumentE 
{
    public static void main(String[] args)
    {
        try 
        {
            circle c1 = new circle(5);
            circle c2 = new circle(-5);
            
        } 
        catch (IllegalArgumentException obj) 
        {
            System.out.println(obj.toString());
        }
        finally
        {
            System.out.println("BYE BYE");
        }    
    }
}