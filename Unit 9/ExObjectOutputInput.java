import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExObjectOutputInput 
{
    public static void main(String[] args)  
    {
        int data=5;
        String s="INDIA";
        try
        {
            FileOutputStream fout=new FileOutputStream("Five.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeInt(data);
            out.writeObject(s);
            out.close();
            fout.close();
            FileInputStream fin=new FileInputStream("Five.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            System.out.println("Interger data "+oin.readInt());
            System.out.println("String data "+oin.readObject());
        }
        catch(Exception e)
        {
            System.out.println("Fail");
        }
        
    }
    
}
