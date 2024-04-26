import java.util.*;
public class SortArray 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(3);
        a1.add(5);
        a1.add(4);
        a1.add(2);
        System.out.println(a1.get(1));
        Collections.sort(a1);
        System.out.println(a1);
    }    
}