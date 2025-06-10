/*
        * 
        * * 
        * * * 
        * * * *
*/
import java.util.*;

class program2
{
    public static void Pattern(int No)
    {
        for(int i = 0; i <= No; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
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