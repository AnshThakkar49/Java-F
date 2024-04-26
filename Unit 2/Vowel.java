//Write A java program to see if entered caracter is vowel or consonent
import java.util.*;
public class Vowel
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String aa;
        char bb,c;     
        System.out.println("Enter 0 to Terminate The Program");
        do 
        {
            System.out.println("Enter Single Character Between a to z in small case");
            aa=sc.next();
            bb=aa.charAt(0);            
            switch (bb) 
            {
                case 'a':
                    System.out.println(bb+" is a Vowel");
                    break;
                case 'e':
                    System.out.println(bb+" is a Vowel");
                    break;
                case 'i':
                    System.out.println(bb+" is a Vowel");
                    break;
                case 'o':                
                    System.out.println(bb+" is a Vowel");
                    break;
                case 'u':                
                    System.out.println(bb+" is a Vowel");
                    break;
                default:
                    System.out.println(bb+" is a Consonent");
                    break;
            }
            System.out.println("Want To Continue??(Y=Yes/N=No): ");
            c=sc.next().charAt(0);
        }while(c!='N');     
    }
}