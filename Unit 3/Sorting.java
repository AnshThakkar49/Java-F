import java.util.*;
public class Sorting
{
    public static int[] bubble(int arr[])
    {
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < (arr.length-1); j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }       
        } 
        return arr; 
    }
    public static void main(String[] args) 
    {
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Before Sorting: ");
        for (int j = 0; j < arr.length; j++) 
        {
            System.out.print(" "+arr[j]);
        }
        System.out.println("");
        bubble(arr);
        System.out.print("After Sorting: ");
        for (int k = 0; k < arr.length; k++) 
        {
            System.out.print(" "+arr[k]);
        }
    }
}
