/*
    write a program which accept range from user and display all numbers in between that range.

    input  : 23 35
    output : 23 24 25 26 27 28 29 30 31 32 33 34 35

    input  : 10 10
    output : 10

    input  : -10 2
    output : -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2

    input  : 90 18
    output : Invalid Range

    Time Complexity : O(N)
*/
import java.util.*;

class program15
{
    public static void Display(int No1,int No2)
    {
        while(No1 <= No2)
        {
            System.out.print(No1+"\t");
            No1++;
        }
    }
    public static void main(String arg[])
    {
        int iValue1 = 0,iValue2 = 0;
        
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the First number:");
        iValue1  = sobj.nextInt();

        System.out.println("Enter the second number:");
        iValue2 = sobj.nextInt();

        Display(iValue1,iValue2);
    }
}