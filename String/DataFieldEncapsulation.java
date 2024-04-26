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
public class DataFieldEncapsulation 
{
    public static void main(String[] args) 
        {
            cat c1 = new cat();
            System.out.println(c1.get());
            //c1.weight = 50; x
            c1.set(50);
            System.out.println(c1.get());            
        }
}
