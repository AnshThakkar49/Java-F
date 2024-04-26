class genericc <T>
{
    T a;
    void show()
    {
        System.out.println("A = "+a);
    }
    void Printtype(T value)
    {
        System.out.println(value.getClass().getName());
    }
    static<T> void printtype(T value) //Generic Method so it will print datatype irrespective of g1's type
    {
        System.out.println(value.getClass().getName());
    }
}
public class Generic
{
    public static void main(String[] args) 
    {
        genericc<Integer>g1= new genericc<>();
        g1.a = 10;
        g1.show();
        g1.Printtype(10);
        //g1.Printtype("String"); Throws Error because g1 only works with integer
        g1.printtype("String");
        genericc<String>g2 = new genericc<>();
        g2.a = "Hello World";
        g2.show();
    }
} 
