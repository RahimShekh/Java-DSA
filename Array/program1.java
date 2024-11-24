/*
Given an integer array nums, return true if any value appears more than once in the array, 
otherwise return false.
Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false                                                                       */
import java.util.*;

class program1
{
    public static boolean Duplicate(int Arr[],int iSize)
    {
        for(int i = 0; i < Arr.length;i++)
        {
            for(int j = i+1; j < Arr.length;j++)
            {
                if(Arr[i] == Arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the No of Elements:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        bRet = Duplicate(Brr,iValue);

        if(bRet == true)
        {
            System.out.println("Array have Duplicate");
        }
        else
        {
            System.out.println("Array Dont have Duplicate");
        }
    }   
}