/* Floor and Ceil in Sorted Array
Problem Statement: ou're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x
Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.
Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
*/
import java.util.*;

class program5
{
    public static int ceil(int brr[],int n,int k)
    {
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] >= k)
            {
                ans = brr[mid];
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return ans;
    }
    public static int floor(int brr[],int n,int k)
    {
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] <= k)
            {
                ans = brr[mid];
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

        ans[0] = floor(arr,size,target);
        ans[1] = ceil(arr,size,target);

        System.out.println("floor: "+ans[0]+" "+"ceil: "+ans[1]);
    }
}