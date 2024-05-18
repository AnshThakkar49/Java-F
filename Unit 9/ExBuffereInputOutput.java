import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExBuffereInputOutput 
{
    public static void main(String[] args)throws IOException
    {
        FileOutputStream fout=new FileOutputStream("Two.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Virat kohli";
        byte[] b=s.getBytes();
        bout.write(b);
        bout.close();
        fout.close();
        FileInputStream fin=new FileInputStream("Two.txt");
        BufferedInputStream bin=new BufferedInputStream(fin);
        int i=0;
        while((i=fin.read())!=-1)
        {
        System.out.print((char)i);
    
        }
        bin.close();
        fin.close();

        
    }
    
}
