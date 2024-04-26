//Design a java class rectangle with fileds as following
//Length and Width as an integer
//Default Constructor which initialize all constructor with 1
//int getArea() will return area of rectangle

import java.util.Scanner;

class rectangle
{
    int length,width;
    rectangle()
    {
        length=1;
        width=1;
    }
    rectangle(int l, int w)
    {
        length=l;
        width=w;
    }
    public int getArea()
    {
        int area = (length*width);
        return area;
    }

}
public class REct
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int len,wid;
        rectangle r1=new rectangle();
        rectangle r2=new rectangle();
        System.out.println("Enter Length and Width Respectively: ");
        len=sc.nextInt();
        wid=sc.nextInt();
        r1.length=len;
        r1.width=wid;
        System.out.println("Area of Rectangle is: "+(r1.getArea()));
        System.out.println("Area of Rectangle is: "+(r2.getArea()));
    }   
}