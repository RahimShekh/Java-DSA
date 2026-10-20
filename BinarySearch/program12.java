/*  Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.
Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10                                                              */
import java.util.*;

class program12
{
    public static void binarySearch(int brr[],int n)
    {
        if(n == 1) System.out.println(brr[0]);
        if(brr[0] != brr[1]) System.out.println(brr[0]);
        if(brr[n-1] != brr[n-2]) System.out.println(brr[n-1]);

        int low = 1;  // bcuz first element alredy checked
        int high = n-2;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(brr[mid] != brr[mid+1] && brr[mid] != brr[mid-1])
            {
                System.out.println("The single element:"+brr[mid]);
                return;
            }

            //elimination

            if(mid % 2==1 && brr[mid] == brr[mid-1] || mid % 2 ==0 && brr[mid] == brr[mid+1])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
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