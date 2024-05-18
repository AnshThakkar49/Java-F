import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExBufferedReaderWriter
{
    public static void main(String[] args) throws IOException
    {
        FileWriter writer=new FileWriter("Seven.txt");
        BufferedWriter bw=new BufferedWriter(writer);
        String s="hello world";
        String s1="\nms dhoni";
        bw.write(s);
        bw.write(s1);
        bw.close();
        writer.close();
        FileReader reader=new FileReader("Seven.txt");
        BufferedReader br=new BufferedReader(reader);
        String line="";
        while ((line=br.readLine())!=null)
        {
            System.out.println(line);   
        }
        br.close();
        reader.close();

    }

}