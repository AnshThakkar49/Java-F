class GrandParent
{
    public void GP()
    {
        System.out.println("Method From GrandParent");
    }
}
class Parent extends GrandParent
{
    public void P()
    {
        System.out.println("Method From Parent");
    }
}
class child extends GrandParent
{
    public void CH()
    {
        System.out.println("Method from Child");
    }
}
public class Multi_Inheritance 
{
    public static void main(String[] args) 
    {
        child c1 = new child();
        Parent p1 = new Parent();
        c1.GP();
        //c1.P();
        c1.CH();      
        p1.GP();
        p1.P();  
    }   
}