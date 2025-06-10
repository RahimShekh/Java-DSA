/*
        1 
        2 2 
        3 3 3 
        4 4 4 4
*/
import java.util.*;

class program4
{
    public static void Pattern(int No)
    {
        for(int i = 1; i <= No; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int no = sobj.nextInt();

        Pattern(no); 
    }
}