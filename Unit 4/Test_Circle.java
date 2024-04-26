import java.util.*;
class ar_circle
{
    double radius;
    ar_circle()
    {
        radius = 1.0;
    }
    public void display()
    {

        System.out.println("Area of Circle is: "+(3.14*radius*radius));
    }
}
public class Test_Circle 
{
    public static void main(String[] args) 
    {
        double rad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        rad=sc.nextDouble();
        ar_circle c1=new ar_circle();
        ar_circle c2=new ar_circle();
        c1.radius=rad;
        c1.display();
        c2.display();
    }    
}