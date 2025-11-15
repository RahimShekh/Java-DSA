/*
Count Maximum Consecutive One's in the array
Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}   Output: 3
Explanation: There are two consecutive 1s and three consecutive 1s in the array out of which
maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1}    Output: 2
Explanation: There are two consecutive 1's in the array.         */

import java.util.*;

class program23
{
    public static void MaxOnes(int Arr[], int n)
    {
        int iCnt = 0;
        int imax = 0;
        for(int i = 0; i < n; i++)
        {
            if(Arr[i] == 1)
            {
                iCnt++;
            }
            else
            {
                iCnt = 0;
            }

            imax = Math.max(imax,iCnt);
        }

        System.out.println("The Count:"+imax);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Elements:");
        int iSize = sobj.nextInt();

        int Brr[] = new int[iSize];

        for(int i = 0; i < iSize; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        MaxOnes(Brr,iSize);
    }
}