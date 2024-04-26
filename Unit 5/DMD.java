class Parent 
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
public class DMD //Dynamic Binding or Dynamic Method Dispatch 
{
    public static void main(String[] args) 
    {
        Parent h = new child();
        h.disp();       
    }   
}