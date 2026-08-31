/*Count Occurrences in Sorted Array
Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.
Example 1:
Input:
 N = 7,  X = 3 , array[] = {2, 2 , 3 , 3 , 3 , 3 , 4}
Output
: 4
Explanation:
 3 is occurring 4 times in 
the given array so it is our answer.
Example 2:
Input:
 N = 8,  X = 2 , array[] = {1, 1, 2, 2, 2, 2, 2, 3}
Output
: 5
Explanation:
 2 is occurring 5 times in the given array so it is our answer.
*/

import java.util.*;

class program7
{
    public static int firstOccurence(int brr[],int n,int k)
    {
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] == k)
            {
                ans = mid;
                high = mid - 1;    // we need to find the first index 
            }
            else if(brr[mid] < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    public static int lastOccurence(int brr[],int n,int k)
    {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] == k)
            {
                ans = mid;
                low = mid +1;  // for to find the last index
            }
            else if(brr[mid] < k)
            {
                low = mid + 1;
               
            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
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

        int ans[] = new int[2];

        System.out.println("Enter the target:");
        int target = sobj.nextInt();

        ans[0] = firstOccurence(arr,size,target);
        ans[1] = lastOccurence(arr,size,target);

        int val = ans[1] - ans[0] + 1;

        System.out.println("The count:"+val);
    }
}