import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF 
{
    public static void main(String[] args) throws IOException 
    {        
        RandomAccessFile inout = new RandomAccessFile("inout.txt","rw");
        inout.setLength(0);
        for (int i = 0; i < 200; i++) 
        {
            inout.writeInt(i);            
        }
        System.out.println("Length of File = "+inout.length());
        inout.seek(0);
        System.out.println("The First Number = "+inout.readInt());
        inout.close();
    }    
}