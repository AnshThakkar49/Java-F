//28-02-2024
import java.util.*;
public class Menu 
{    
    public static void main(String[] args) 
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Pizaa\n2.Burger\n3.Sandwich\n4.Pasta\n5.Dosa\n6.Exit");
        System.out.print("Enter Your Choice: ");
        choice=sc.nextInt();
        while (choice!=6) 
        {          
            switch (choice) 
            {
                case 1:
                    System.out.println("You Have Selected Pizza.");               
                    break;
                case 2:
                    System.out.println("You Have Selected Burger.");
                    break;
                case 3:
                    System.out.println("You Have Selected Sandwich.");
                    break;
                case 4:
                    System.out.println("You Have Selected Pasta.");
                    break;
                case 5:
                    System.out.println("You Have Selected Dosa.");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Enter Vaid Input");
                    break;
            }
        }
        System.out.println("Bye Bye!!");
    }    
}