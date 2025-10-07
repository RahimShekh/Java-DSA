/*
    Accept number from user and display below pattern.

    input  : 5
    output : A B C D E
    Time Complexity : O(N)
*/
import java.util.*;

class program20
{
    public static void Display(int iNo)
    {
        char ch = 'A';

        for(int i = 0; i < iNo; i++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no:");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}