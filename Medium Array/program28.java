/*
Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.
*/
//Two sum problem
//brute force

import java.util.*;

class program28
{
    public static int[] TwoSum(int Brr[],int Target)
    {
        int temp[] = new int[2];
        temp[0] = -1,temp[1] = -1;  // rakho agar target nhi mila toh
         
        for(int i=0; i < Brr.length; i++)
        {
            for(int j= i+1; j < Brr.length; j++)
            {
                if(Brr[i] == Brr[j]) continue; // if i and j then skip the iteration

                if(Brr[i] + Brr[j] == Target)
                {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return null;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int isize = sobj.nextInt();

        int Arr[] = new int[isize];

        for(int i=0; i< isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the Target:");
        int target = sobj.nextInt();

        int ans[] = TwoSum(Arr,target);

        System.out.println("The index is:"+ans[0]+" "+ans[1]);
    }
}