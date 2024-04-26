class cat
{
    private int weight = 30;
    public int get()
    {
        return weight;
    }
    public void set(int w)
    {
        weight = w;
    }
}
public class D 
{
    public static void main(String[] args)
    {
        cat c = new cat();
        System.out.println(c.get());
        c.set(50);
        System.out.println(c.get());
    }
    
}
