/*   Maximum Product Subarray
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Note that the product of an array with a single element is the value of that element.
Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/

import java.util.*;

class program13
{
    public static void Logic(int brr[],int n,int k)
    {
        int maxProduct = 0;
        
        if(n == 1 && brr[0] < 0)
        {
            return brr[0];
        }
       for(int i=0; i<n; i++)
       {
            int product = 1;
            for(int j=i; j<n; j++)
            {
                product = product * brr[j];

                maxProduct = Math.max(maxProduct,product);
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

        System.out.println("Enter the target:");
        int target = sobj.nextInt();

        Logic(arr,size,target);
    }
}