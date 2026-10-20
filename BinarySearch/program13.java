/* Binary Search -  Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator. 
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.                                             */
import java.util.*;

class program13
{
    public static int binarySearch(int n)
    {
        if (n == 0 || n == 1) return n;

        int low = 1;
        int high = n / 2;
        int ans = 1;
        while(low <= high)
        {
            int mid = (low+high) / 2;

            // it can be bigger no so convert in long
            if((long)mid * mid <=  n)
            {
                ans = mid;
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

        System.out.println("Enter the number:");
        int num = sobj.nextInt();
        
        int ans = binarySearch(num);

        System.out.println("The ans:"+ans);
    }
}