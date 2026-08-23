/*  Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, return the 
minimal length of a subarray whose sum is greater than or equal to target. If there
is no such subarray, return 0 instead.
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
*/

import java.util.*;

class program10
{
    public static void Logic(int brr[],int n,int k)
    {
        int minLen = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum = sum + brr[j];

                if(sum == k)
                {
                    minLen = Math.min(minLen,j-i+1);
                }
            }  
        }
        if(minLen == Integer.MAX_VALUE)  // if we dont found the target
        {
            minLen = 0;
        }

        System.out.println("The minimum length:"+minLen);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sobj.nextInt();

        Logic(arr,size,target);
    }
}