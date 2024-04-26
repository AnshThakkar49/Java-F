public class Buf 
{
    public static void main(String[] args) 
    {
        StringBuffer S1= new StringBuffer("");
        System.out.println(S1.capacity());
        System.out.println(S1.append("Java & HTML"));
        System.out.println(S1.insert(0, "Welcome to"));
        System.out.println(S1.delete(8, 11));
        System.out.println(S1.deleteCharAt(5));
        System.out.println(S1.reverse());
        System.out.println(S1.replace(11, 15, "Python"));
        System.out.println(S1.substring(5,7));
        S1.setLength(5);
        System.out.println(S1.toString());
    }  
}