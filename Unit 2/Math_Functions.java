import java.lang.Math;
public class Math_Functions 
{
    public static void main(String[] args) 
    {        
        int x,y;
        double z;
        x=2;
        y=3;
        z=2.3;
        System.out.println("Maximum of "+x+" & "+y+" is "+Math.max(x, y));
        System.out.println("Minimum of "+x+" & "+y+" is "+Math.min(x, y));
        System.out.println(x+" ^ "+y+" is "+Math.pow(x, y));
        System.out.println("Sq.Root of "+x+" & "+y+" is "+Math.sqrt(x)+" & "+Math.sqrt(y));
        System.out.println("Absolute Value of -"+x+" & -"+y+" is "+Math.abs(-x)+" & "+Math.abs(-y));
        System.out.println("Log of "+x+" is "+Math.log(x));
        System.out.println("Log10 of "+x+" is "+Math.log10(x));
        System.out.println("Round off of "+z+" is "+Math.round(z));
        System.out.println("Ceiling Value of "+z+" is "+Math.ceil(z));
        System.out.println("Floor Value of "+z+" is "+Math.floor(z));
        System.out.println("Value of e is "+Math.exp(z));
    }    
}