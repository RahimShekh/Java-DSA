/*    Find out how many times the array has been rotated
Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find how many times the array has been rotated.
Input : arr = [4,5,6,7,0,1,2,3]
Result: 4
Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.
Input : arr = [3,4,5,1,2]
Output : 3
Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.
*/
import java.util.*;
// the smallest value in the array is the count of values index is the ans of rotation
class program11
{
    public static void binarySearch(int brr[],int n)
    {
        int low = 0;
        int high = n-1;
        int iMin = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(brr[low] <= brr[high])
            {
                index = low;
                iMin = brr[low];
                break;
            }
            // eliminate the sorted part 
            if(brr[low] <= brr[mid])
            {
                if(brr[low] < iMin)
                {
                    index = low;
                    iMin = brr[low];
                }
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
                if(brr[mid] < iMin)
                {
                    index = mid;
                    iMin = brr[mid];
                }
            }
        }

        System.out.println("The array has rotated:"+index);
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

/*  find duplicates in rotated sorted array
import java.util.*;

class program12
{
    public static int binarySearch(int brr[], int n, int target)
    {
        int low = 0;
        int high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            // target found
            if(brr[mid] == target)
            {
                return mid;
            }

            // When we cannot determine the sorted half
            if(brr[low] == brr[mid] && brr[mid] == brr[high])
            {
                low++;
                high--;
            }

            // Left half is sorted
            else if(brr[low] <= brr[mid])
            {
                // target lies in left half
                if(brr[low] <= target && target < brr[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else
            {
                // target lies in right half
                if(brr[mid] < target && target <= brr[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements:");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sobj.nextInt();

        int index = binarySearch(arr, size, target);

        if(index != -1)
        {
            System.out.println("Target found at index: " + index);
        }
        else
        {
            System.out.println("Target not found");
        }
    }
}

*/