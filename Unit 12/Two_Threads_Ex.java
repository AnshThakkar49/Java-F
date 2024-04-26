class MyThread implements Runnable
{
    public void run()
    {
        try 
        {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println("Welcome");
                Thread.sleep(1000);
            }         
        }
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}
class MyThread1 implements Runnable
{
    public void run()
    {
        try 
        {
            for(int i = 1; i<=5; i++)
            {
                System.out.println("Good Bye!!");
                Thread.sleep(5000);
            }            
        }
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}
public class Two_Threads_Ex 
{
    public static void main(String[] args)
    {
            MyThread t1 = new MyThread();
            Thread t = new Thread(t1);
            t.start();
            MyThread1 t2 = new MyThread1();
            Thread s = new Thread(t2);
            s.start();
    }        
    
}
