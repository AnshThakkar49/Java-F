//wap which copies contant of on file into another

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataCopy 
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fout=new FileOutputStream("Three.txt");
        FileInputStream fin=new FileInputStream("Two.txt");
        int i=0;
        while((i=fin.read())!=-1)
        {
            fout.write(i);
        }
        fout.close();
        fin.close();
        
    }
    
}
