import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExFileInputOutputStream 
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fout=new FileOutputStream("One.txt");
        FileInputStream fin=new FileInputStream("One.txt");
        String s="HELLo";
        byte[] b=s.getBytes();
        fout.write(b);
        fout.close();
        int i=0;
        while((i=fin.read())!=-1)
        {
        System.out.print((char)i);
    
        }
        fin.close();
    }
}
