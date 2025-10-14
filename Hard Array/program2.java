/*
Example 1:
Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
Output: 6 
Explanation: [4,-1,2,1] has the largest sum = 6. 

Examples 2: 
Input: arr = [1] 
Output: 1 
Explanation: Array has only one element and which is giving positive sum of 1. */
//better solution

import java.util.*;

class program2
{
    public static void Logic(int Brr[],int n)
    {
        int maxSum = 0;

        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum = sum + Brr[j];

                maxSum = Math.max(sum,maxSum);
            }
        }

        System.out.println("The maximum sum:"+maxSum);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int isize = sobj.nextInt();

        int Arr[] = new int[isize];

        for(int i=0; i<isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,isize);
    }
}