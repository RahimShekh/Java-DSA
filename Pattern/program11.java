/*
    1      1
    12    21
    123  321
    12344321
 */
import java.util.*;

class program11
{
    public static void Pattern(int No)
    {
        int space = 2 *(No-1);
        for(int i = 1; i <= No; i++)
        {
            //Number
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            //Space
            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            //Number
            for(int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
            space = space-2;
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