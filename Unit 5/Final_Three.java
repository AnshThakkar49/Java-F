final class Parent 
{
    public void disp()
    {
        System.out.println("Method Overriden");
    }    
}
class child extends Parent
{
    public void disp()
    {
        System.out.println("Overriding Method");
    }
}
public class Final_Three
{
    public static void main(String[] args) 
    {
        child c = new child();
        c.disp();
        Parent p = new Parent();
        p.disp();        
    }   
}