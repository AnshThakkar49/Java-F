import java.util.*;
class circle
{
    double radius;
    static int objects=0;
    public int getobjects()
    {
        return objects;
    }
    circle()
    {
        objects++;
    }
}
public class Test_Circle_Static
{
    public static void main(String[] args) 
    {
        double rad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        rad=sc.nextDouble();
        circle c1=new circle();
        System.out.println("Total Objects Created: "+(circle.getobjects));
    }    
}