/*  plus one
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/
import java.util.*;

class pluseOne
{
    public static int[] Logic(int brr[],int n)
    {
        for(int i=n-1; i>=0; i--)
        {
            if(brr[i] < 9)
            {
                brr[i] = brr[i] + 1;
                return brr;
            }

            brr[i] = 0;
        }

        // if arr is [9,9,9] then this edge case
        int ans[] = new int[n+1];
        ans[0] = 1;

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

        arr = Logic(arr,size);

        for(int it : arr)
        {
            System.out.print(it+" ");
        }
    }
}