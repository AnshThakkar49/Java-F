public class FirstFive 
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Hiee";
        System.out.println(s1.charAt(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains("He"));
        System.out.println(s1.endsWith("z"));
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.isEmpty());
        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s1.length());
        System.out.println(s1.replace("H", "O"));
        System.out.println(s1.replaceAll("Hello","ABC"));
        System.out.println(s2.replaceFirst("H", "N"));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        char[]arr=s1.toCharArray();
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        System.out.println(s2.trim());  
    }
}