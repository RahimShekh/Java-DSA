/*
    write a program which accept range from user and return addition of all numbers in between that range.
    (Range should contains positive numbers only)

    input  : 23 30
    output : 212

    input  : 10 18
    output : 126

    input  : -10 2
    output : Invalid Range

    Time Complexity : O(N)
*/

import java.util.*;

class program16
{
    public static void Display(int No1,int No2)
    {
        int iSum = 0;

        while(No1 <= No2)
        {
            iSum = iSum + No1;
            No1++;
        }
        System.out.print(iSum+"\t");
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