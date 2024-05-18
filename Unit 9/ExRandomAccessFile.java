import java.io.IOException;
import java.io.RandomAccessFile;

public class ExRandomAccessFile 
{
    public static void main(String[] args)throws IOException 
    {
        RandomAccessFile inout=new RandomAccessFile("inout.txt", "rw");
        inout.setLength(0);
        for(int i=0;i<200;i++)
        {
            inout.writeInt(i);
        }
        System.out.println("Length of file="+inout.length());
        inout.seek(4);
        System.out.println("The first number= "+inout.readInt());
        
    }
    
}
