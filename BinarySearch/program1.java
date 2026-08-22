/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. 
Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
Tc = O(logN)
*/
import java.util.*;

class program1
{
    public static void BinarySearch(int brr[],int n,int target)
    {
        int low = 0;
        int high = n-1;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] == target)
            {
                System.out.println("The index of target:"+mid);
                return;
            }
            else if(target > brr[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("The index not found");
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
        int k = sobj.nextInt();

        BinarySearch(arr,size,k);
    }
}