/* Count subarryas sum equal to k
Given an array of integers and an integer k, return the total number of
subarrays whose sum equals k.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
Result: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
Example 2:
Input Format: N = 3, array[] = {1,2,3}, k = 3
Result: 2
Explanation: The subarrays that sum up to 3 are [1, 2], and [3].
Better Approach: Tc O(n2)*/

import java.util.*;

class program9
{
    public static void Logic(int Brr[],int n,int k)
    {
        int max = 0;
        int iCnt = 0;
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            
            for(int j=i; j<n; j++)
            {
                sum = sum + Brr[j];
                if(sum == k)
                {
                    iCnt++;
                }
            }
            max = Math.max(iCnt,max);
        }

        System.out.println("The count of subaaryas:"+max);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        System.out.println("Enter the sum:");
        int target = sobj.nextInt();

        Logic(Arr,size,target);
    }
}