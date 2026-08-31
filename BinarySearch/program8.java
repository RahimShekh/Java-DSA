/* Search Element in a Rotated Sorted Array - I  (unique elements)
Problem Statement: Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.
Examples
Input:nums = [4, 5, 6, 7, 0, 1, 2], k = 0
Output :4
Explanation : Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums. Thus, we get output as 4, which is the index at which 0 is present in the array.
Input: nums = [4, 5, 6, 7, 0, 1, 2], k = 3
Output :-1
Explanation :Here, the target is 3. Since 3 is not present in the given rotated sorted array. Thus, we get the output as -1.
*/
import java.util.*;

class program8
{
    public static void binarySearch(int brr[],int n,int k)
    {
        int low = 0;
        int high = n-1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(brr[mid] == k)
            {
                System.out.println("the index:"+mid);
                return;
            }
            //check left part is sorted or not
            else if(brr[low] <= brr[mid])
            {
                if(brr[low] <= k && k <= brr[mid])  // check if element is present init
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else    // check right part is sorted or not
            {
                if(brr[mid] < k && k <= brr[high])   // check if element is present init
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
         // <= is liye what if array have 1 element
        System.out.println("the index not found");
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

        binarySearch(arr,size,target);
    }
}