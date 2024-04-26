import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex_ReaderWriter 
{
    public static void main(String[] args)throws IOException
    {
        FileWriter writer = new FileWriter("six.txt");
        String s = "IPL is Going to End";
        String s1 = "\nHii There";
        writer.write(s);
        writer.write(s1);
        writer.close();    
        FileReader reader = new FileReader("six.txt");
        int i;
        while ((i=reader.read())!=-1) 
        {  
            System.out.print((char)i);            
        }    
        reader.close();
    }  
}