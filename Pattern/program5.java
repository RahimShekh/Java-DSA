/*
        ***** 
        **** 
        *** 
        **
        *
*/
import java.util.*;

class program5
{
    public static void Pattern(int No)
    {
        for(int i = No; i >= 0; i--)
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

/*  other logic
public static void Pattern(int No)
    {
        for(int i = 1; i < No; i++)
        {
            for(int j = 1; j <= No-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

 */