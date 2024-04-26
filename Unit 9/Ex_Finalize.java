public class Ex_Finalize 
{
    public static void main(String[] args) 
    {
        Ex_Finalize obj1 = new Ex_Finalize();
        obj1 = null;
        System.out.println("Object is going to destroy");
        System.gc();         
    }    
    protected void finalize()
    {
        System.out.println("Finallize Method Called");
    }
}
