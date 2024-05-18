import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExStremReaderWriter 
{
    public static void main(String[] args)throws IOException
    {
        FileInputStream fin=new FileInputStream("Seven.txt");
        InputStreamReader Ir=new InputStreamReader(fin);
        FileOutputStream fout=new FileOutputStream("Eight.txt");
        OutputStreamWriter Ow=new OutputStreamWriter(fout);
        int i=0;
        while ((i=Ir.read())!=-1) 
        {
            Ow.write(i);
            
        }
        Ir.close();
        Ow.close();
        fin.close();
        fout.close();
        
        
    }
    
}
