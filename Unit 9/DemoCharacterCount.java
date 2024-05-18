import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoCharacterCount 
{
    public static void main(String[] args)throws IOException 
    {
        String filename=args[0];
        FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        int countLine=0;
        int charcount=0;
        int wordcount=0;
        String s="";
        while ((s=br.readLine())!=null) 
        {
            countLine++;    
            String words[]=s.split(" ");
            wordcount=wordcount+words.length;
            for(int i=0;i<words.length;i++)
            {
                charcount=charcount+words[i].length();
            }         
        }
        System.out.println("Number Of Lines= "+countLine);
        System.out.println("Number of words= "+wordcount);
        System.out.println("Number of character= "+charcount);
        fr.close();
        br.close();
        
    }
    
}
