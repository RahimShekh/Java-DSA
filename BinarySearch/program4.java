/*
 You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.
 Example 1:
Input Format: arr[] = {1,2,4,7}, x = 6
Result: 3
Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.
Example 2:
Input Format: arr[] = {1,2,4,7}, x = 2
Result: 1
Explanation: 2 is present in the array and so we will return its index i.e. 1.
*/
import java.util.*;

class program4
{
    public static void BinarySearch(int brr[],int n,int x)
    {
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] >= x)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        System.out.println("the index will be :"+ans);
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