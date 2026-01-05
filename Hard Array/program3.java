/*  maximum sum   yaha ke ki value nhi milegi
Example 1:
Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
Output: 6 
Explanation: [4,-1,2,1] has the largest sum = 6. 

Examples 2:
Input: arr = [1] 
Output: 1 
Explanation: Array has only one element and which is giving positive sum of 1. */
//optimal solution
// using kadane algorithm tc - O(n)

import java.util.*;

class program3
{
    public static void Logic(int Brr[],int n)
    {
       int maxSum = Integer.MIN_VALUE;
       int sum = 0;

       for(int i=0; i<n; i++)
       {
            sum = sum + Brr[i];

            maxSum = Math.max(maxSum,sum);

            if(sum < 0)
            {
                sum = 0;
            }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
       }

       System.out.println("The maximum:"+maxSum);
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
