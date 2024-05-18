import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExReaderWriter 
{
    public static void main(String[] args)throws IOException 
    {
        FileWriter writer=new FileWriter("Six.txt");
        String s="IPL is going to end";
        String s2="\nHello World";
        writer.write(s);
        writer.write(s2);
        writer.close();        
        FileReader reader=new FileReader("Six.txt");
        int i=0;
        while ((i=reader.read())!=-1) 
        {
            System.out.print((char)i);
            
        }
        reader.close();

    }
    
}
