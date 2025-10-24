/*  Longest subarray with sum k problem
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
*/
//better solution

import java.util.*;

class program1
{
    public static int Logic(int Brr[],int n,int k)
    {
        int maxLen = 0;

        for(int i=0; i<n; i++)
        {
            int sum = 0;   // bar reset hoga 0

            for(int j=i; j<n; j++)
            {
                sum = sum + Brr[j];

                if(sum == k)
                {
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }

        return maxLen;
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

        System.out.println("Enter the target sum:");
        int target = sobj.nextInt();

        int len = Logic(Arr,isize,target);

        System.out.println("The maximum length of the sum:"+len);
    }
}