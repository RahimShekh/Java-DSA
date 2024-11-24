/*
Given an integer array nums,find the second largest element from the given array
Example 1:
Input: nums = [1, 2, 3, 3]
Output: 2

Input: nums = [1, 2, 3, ,4,5,7]
Output: 5
*/
import java.util.*;

class LargestElement
{
    public static void main(int Arr[],int iNo)
    {
        //find out the largest element first
        int iLarge = Arr[0];
        for(int i = 0; i < Arr.length;i++)
        {
            if(Arr[i] > iLarge)
            {
                iLarge = Arr[i];
            }
        }
        //find the second largest now
        int sLarge = -1;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] > sLarge) && (Arr[i] != iLarge))
            {
                sLarge = Arr[i];
            }
        }

        System.out.println("Second Largest Element in the Array:"+sLarge);
    }
}
class program2
{
    public static void main(String arg[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of Elements:");
        iSize = sobj.nextInt();

        int Brr[] = new int[iSize];

        for(int i = 0; i < iSize; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        LargestElement.main(Brr,iSize);
    }
}
// time Complexity = O(2n)