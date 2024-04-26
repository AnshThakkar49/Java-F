import java.math.*;
public class Big_Decima 
{
    public static void main(String[] args) 
    {
        BigDecimal i = new BigDecimal("12346.789456123");
        BigDecimal j = new BigDecimal(123456.789456123);
        i = i.add(j);
        System.out.println("BigDecimal 1: "+i);
        i = i.multiply(j);
        System.out.println("Mul: "+i);
        BigInteger k = new BigInteger("123456789123456789123456789");
        BigInteger l = new BigInteger("123456789123456789123456789");
        k = k.add(l);
        System.out.println("Add: "+k);
    }   
}