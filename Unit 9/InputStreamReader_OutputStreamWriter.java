import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_OutputStreamWriter 
{
    public static void main(String[] args)throws IOException 
    {
        FileInputStream Fin = new FileInputStream("seven.txt");
        InputStreamReader IR = new InputStreamReader(Fin);
        FileOutputStream Fout = new FileOutputStream("eight.txt");
        OutputStreamWriter OW = new OutputStreamWriter(Fout);
        int i = 0;
        while((i = IR.read())!=-1)
        {
            OW.write(i);
        }    
        IR.close();
        OW.close();
        Fin.close();
        Fout.close();
        
    }
}