/*
Given an integer array nums,find the second Smallest element from the given array
Example 1:
Input: nums = [1, 2, 3, 3]
Output: 2

Input: nums = [1, 2, 3, ,4,5,7]
Output: 2
*/
import java.util.*;

class program4
{
    public static void SmallestElement(int Arr[],int iSize)
    {
        int iSmall = Arr[0];
        int sSmallest = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < iSmall)
            {
                sSmallest =iSmall;
                iSmall = Arr[i];
            }
            else if((Arr[i] < iSmall) && (Arr[i] < sSmallest))
            {
                sSmallest = Arr[i];
            }
        }


        System.out.println("The Second Smallest :"+sSmallest);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No of Elements:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        SmallestElement(Brr,iValue);
    }
}