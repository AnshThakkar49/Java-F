class MyThread2 implements Runnable
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
public class Ex_RunnableInterface 
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 3; i++)
        {
            MyThread2 t1 = new MyThread2();
            Thread t = new Thread(t1);
            t.start();
        }
    }        
}