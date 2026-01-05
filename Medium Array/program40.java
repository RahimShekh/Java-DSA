/*The Two Sneaky Numbers of Digitville
In the town of Digitville, there was a list of numbers called nums containing integers
from 0 to n - 1. Each number was supposed to appear exactly once in the list, however,
two mischievous numbers sneaked in an additional time, making the list longer than 
usual.
As the town detective, your task is to find these two sneaky numbers. Return an array 
of size two containing the two numbers (in any order), so peace can return to Digitville.
Example 1:
Input: nums = [0,1,1,0]
Output: [0,1]
Explanation:
The numbers 0 and 1 each appear twice in the array.
Example 2:
Input: nums = [0,3,2,1,3,2]
Output: [2,3]
Explanation:
The numbers 2 and 3 each appear twice in the array.
Example 3:
Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
Output: [4,5]
Explanation:
The numbers 4 and 5 each appear twice in the array.
*/
import java.util.*;

class program40
{
    public static void Logic(int Brr[],int n)
    {
        int ans[] = new int[2];
        int val = 0;
        for(int i=0; i<n; i++)
        {
            int iCnt = 0;
            for(int j=i; j<n; j++)
            {
                if(Brr[i] == Brr[j])
                {
                    iCnt++;
                }
            }

            if(iCnt == 2)
            {
                ans[val] = Brr[i];
                val++;
            }
        }
        System.out.println("The two sneaky numbers:"+ans[0]+" "+ans[1]);
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

        Logic(arr,size);
    }
}