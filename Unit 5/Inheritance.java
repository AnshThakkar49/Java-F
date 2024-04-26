class base
{
    int base_value=10;   
    public void display()
    {
        System.out.println("Method from base: ");
    } 
}
class Derived extends base
{
    public void derived()
    {
        System.out.println("Method from Derived: ");
    }
}
public class Inheritance 
{
    public static void main(String[] args) 
    {
        Derived dl = new Derived();
        dl.display();
        dl.derived();
        dl.base_value = 20;
        System.out.println(dl.base_value);        
    }   
}