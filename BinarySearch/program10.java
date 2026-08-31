/*  Minimum in Rotated Sorted Array
Given an integer array arr of size N, sorted in ascending order (with distinct values), the array is rotated at any index which is unknown. Find the minimum element in the array.
Input: arr = [4,5,6,7,0,1,2,3]
Output: 0
Explanation: The minimum element in the array is 0.
Input : arr = [3,4,5,1,2]
Output: 1
Explanation : The minimum element in the array is 1.
*/
import java.util.*;

class program10
{
    public static void binarySearch(int brr[],int n)
    {
        int low = 0;
        int high = n-1;
        int iMin = Integer.MAX_VALUE;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            //if the whole array is sorted
            if(arr[low] <= arr[high])
            {
                iMin = Math.min(iMin,brr[low]);
                break;
            }
            // eliminate the sorted part 
            if(brr[low] <= brr[mid])
            {
                iMin = Math.min(iMin,brr[low]);  // if sorted put low in iMin
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
                iMin = Math.min(iMin,brr[mid]); 
            }
        }

        System.out.println("The minimum:"+iMin);
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

        binarySearch(arr,size);
    }
}