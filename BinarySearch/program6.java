/* Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting nd ending position of a given target value.If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
*/
import java.util.*;

class program6
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
                high = mid - 1;
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
                low = mid +1;
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

        System.out.println("The first occurence:"+ans[0]);
        System.out.println("The last occurence:"+ans[1]);
    }
}