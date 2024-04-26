import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo_CharCount 
{
    public static void main(String[] args) throws IOException 
    {
        String filename = args[0];
        FileReader reader = new FileReader(filename);
        BufferedReader BR = new BufferedReader(reader);
        int countL = 0;
        int countW = 0;
        int countC = 0;
        String line = "";
        while ((line = BR.readLine())!=null) 
        {
            countL++;
            String words[] = line.split(" ");
            countW = countW + words.length; 
            for (int i = 0; i < words.length; i++) 
            {
                countC = countC + words[i].length();   
            }          
        }        
        System.out.println("Number of Lines = "+countL);
        System.out.println("Number of Words = "+countW);
        System.out.println("Number of Characters = "+countC);
        reader.close();
        BR.close();
    }    
}