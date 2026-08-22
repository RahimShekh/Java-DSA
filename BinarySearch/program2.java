/* Lower bound         IMP
Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
Example 1:
Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 1
Explanation: Index 1 is the smallest index such that arr[1] >= x.
Example 2:
Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
Result: 3
Explanation: Index 3 is the smallest index such that arr[3] >= x.
*/
import java.util.*;

class program2
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

        System.out.println("the smallest index in sorted array:"+ans);
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