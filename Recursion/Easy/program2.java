/*

    Write a recursive program which display below pattern.

    Input  :    6

    Output :   A    B   C   D   E   F

*/

import java.util.*;

class program2
{
    static int No = 0;
    static char ch ='A';

    public static void Display(int iNo)
    {
        if(No <= iNo)
        {
            System.out.print(ch);
            ch++;
            No++;
            Display(iNo);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the No:");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}