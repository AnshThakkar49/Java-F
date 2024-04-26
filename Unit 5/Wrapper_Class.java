public class Wrapper_Class 
{ 
    public static void main(String[] args) 
    {
        //AutoBoxing
        int a = 10;
        Integer i = Integer.valueOf(a);
        System.out.println(i);
        System.out.println(a);
        //AutoUnboxing
        //Integer j = new Integer(20); //Deprecated i.e. not allowed in higher versions
        //int b = j.intValue();
        //System.out.println(j);
        //System.out.println(b);  
        //For Double
        double c = 20.00;
        Double k = Double.valueOf(c);
        System.out.println(c);      
    }    
}