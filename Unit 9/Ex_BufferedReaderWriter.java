import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_BufferedReaderWriter 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter writer = new FileWriter("seven.txt");
        BufferedWriter BW = new BufferedWriter(writer);
        String S = "Hii There!!";
        String T = "\nHello World";
        BW.write(S);
        BW.write(T); 
        BW.close();
        writer.close();
        FileReader reader = new FileReader("seven.txt");
        BufferedWriter BR = new BufferedWriter(reader);
        String line = "";
        while ((line=BR.readline())!=null) 
        {
            System.out.println(line);
        }
        BR.close();
        reader.close();
    }    
}