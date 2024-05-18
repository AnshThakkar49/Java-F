import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExDataInputOutput 
{
    public static void main(String[] args)throws IOException 
    {
        FileOutputStream fout=new FileOutputStream("Four.txt");
        DataOutputStream dout=new DataOutputStream(fout);
        String s="Meet";
        byte[] b=s.getBytes();
        dout.write(b);
        dout.close();
        fout.close();
        FileInputStream fin=new FileInputStream("Four.txt");
        DataInputStream din=new DataInputStream(fin);
        int i=0;
        while((i=fin.read())!=-1)
        {
        System.out.print((char)i);
    
        }
        din.close();
        fin.close();



    }
    
}
