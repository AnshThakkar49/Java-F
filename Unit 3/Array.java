import java.util.*;
public class Array 
{
    public static int[] search(int[]arr,int key)
    { 
        for (int i = 0; i < arr.length; i++) 
        {
            if (key==arr[i]) 
            {
                return i;            
            }
            return -1;        
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        int key,index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Elements of Array");
        for (int i = 0; i < 10; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("Enter Eelement to Search");
        key = sc.nextInt();
        index = search(arr,key);
        if (index==-1) 
        {
            System.out.println("Element Not Found");           
        }
        else
        {
            System.out.println("Element "+key+" found at "+index);
        }
    }
}