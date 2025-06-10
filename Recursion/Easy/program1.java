/*
    Write a recursive program which display below pattern.

    Output :   5    4   3   2   1   

*/
import java.util.*;

class program1
{
    public static void Display(int No)
    {
        if(No > 0)
        {
            System.out.print(No+"\t");
            No--;
            Display(No);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}