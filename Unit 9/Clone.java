//Cloneable Interface
class CopyObjects implements Cloneable
{
    String S;
    CopyObjects(String S)
    {
        this.S = S;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Clone 
{ 
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        CopyObjects s1 =  new CopyObjects("NEw LJ");
        CopyObjects s2 = (CopyObjects) s1.clone();
        System.out.println(s1.S);
        System.out.println(s2.S);        
    }    
}
