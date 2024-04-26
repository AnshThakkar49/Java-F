class MultiThreading extends Thread
{
    public void run()
    {
        try 
        {
            for (int i = 1; i <3; i++) 
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }            
        }
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}
public class ByExtend
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 3; i++)
        {
            MultiThreading t1 = new MultiThreading();
            t1.start();
        }
    }    
}
