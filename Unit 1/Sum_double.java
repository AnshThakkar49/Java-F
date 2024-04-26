//23-02-2024
public class Sum_double{
    public static void main(String[] args) 
    {
        System.out.println(args[0]);
        System.out.println(args[1]);
        double a,b,sum;
        a=Double.parseDouble(args[0]); // Convert String to Double
        b=Double.parseDouble(args[1]);
        sum= a+b;
        System.out.println(sum);
    }
}