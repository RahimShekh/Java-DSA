/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not
equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need 
to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not 
equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

import java.util.*;

class program7
{
    public static void RemoveOccurence(int nums[],int val)
    {
        int j = 0;

        System.out.print(nums[j]+"\t");

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                
                nums[j] = nums[i];
                System.out.print(nums[j]+"\t");
                j++;
            }
        }
    }

    public static void main(String arg[])
{
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the No of Elements:");
    int iValue = sobj.nextInt();

    int Arr[] = new int[iValue];

    for(int i = 0; i < iValue; i++)
    {
        Arr[i] = sobj.nextInt();
    }

    System.out.println("Enter the No u Want to Remove:");
    int iNo = sobj.nextInt();

    RemoveOccurence(Arr,iNo);
}
}
//O(N)