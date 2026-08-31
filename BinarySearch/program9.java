/*   Search Element in Rotated Sorted Array II (duplicates)
Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.
Example 1:
Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
Result: True
Explanation: The element 3 is present in the array. So, the answer is True.
Example 2:
Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
Result: False
Explanation: The element 10 is not present in the array. So, the answer is False.
*/
import java.util.*;

class program9
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
                System.out.println("True");
                return;
            }
            //check for duplicates
            if(brr[low] == brr[mid] && brr[mid] == brr[high])
            {
                low++;
                high--;
                continue;   // go back to while loop again and find mid
            }
            //check left part is sorted or not
            if(brr[low] <= brr[mid])
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

        System.out.println("False");
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