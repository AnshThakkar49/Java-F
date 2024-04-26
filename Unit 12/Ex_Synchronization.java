class Table 
{
    synchronized void PrintTable(int i)
    {
        for (int j = 1; j < 11; j++) 
        {
            System.out.println(i+"x"+j+"="+(i*j));            
        }
        try 
        {
            Thread.sleep(10000);            
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());    
        }
    }
}
class MyThread1 extends Thread
{
    Table t;
    MyThread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.PrintTable(5);
    }
}
class MyThread2 extends Thread
{
    Table t;
    MyThread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.PrintTable(6);
    }
}
public class Ex_Synchronization 
{
    public static void main(String[] args) 
    {
        Table t = new Table();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();        
    }
}