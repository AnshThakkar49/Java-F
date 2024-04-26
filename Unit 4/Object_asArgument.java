class ObjectPass
{
    int a,b;
    ObjectPass(int i, int j)
    {
        a=i;
        b=j;
    }
    boolean equalto(ObjectPass o)
    {
        return(o.a==a && o.b==b);
    }
}
public class Object_asArgument
{
    public static void main(String[] args) 
    {
        ObjectPass ob1 = new ObjectPass(100, 200);
        ObjectPass ob2 = new ObjectPass(100, 200);
        System.out.println("ob1==ob2 "+(ob1.equalto(ob2)));        
    }
}