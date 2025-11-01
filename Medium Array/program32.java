/* Longest Consecutive sequence in Array
You are given an array of ‘N’ integers. You need to find the length of the 
longest sequence which contains the consecutive elements.
Example 1:
Input: [100, 200, 1, 3, 2, 4]
Output: 4
Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.
Input: [3, 8, 5, 7, 6]
Output: 4
Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.  */
// Brute force  tc-O(n2);

import java.util.*;

class program32
{
    public static Boolean linearSearch(int nums[],int val)
    {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            if(nums[i] == val)
            {
                return true;
            }
        }
        return false;
    }
    public static void Logic(int Brr[],int n)
    {
        int len = 0;
    
        for(int i=0; i<n; i++)
        {
            int iCnt = 1;    // current no ka count
            int elem = Brr[i];

            while(linearSearch(Brr,elem+1) == true)
            {
                elem++;
                iCnt++;
            }

            len = Math.max(len,iCnt);
        }

        System.out.println("The maximum len of sequence:"+len);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,size);
    }
}
