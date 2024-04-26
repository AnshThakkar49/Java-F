public class Jagged_Array 
{
    public static void main(String[] args) 
    {
        int Jagged_Array[][]=new int[3][];
        Jagged_Array[0]=new int[]{10,20,30};
        Jagged_Array[1]=new int[]{40,50};
        Jagged_Array[2]=new int[]{60,70,80,90};
        for (int i = 0; i < Jagged_Array.length; i++) 
        {
            for (int j = 0; j < Jagged_Array[i].length; j++) 
            {
                System.out.print(Jagged_Array[i][j]+"\t");                
            }
            System.out.println("");
        }        
    }    
}