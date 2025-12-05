/* Longest Consecutive sequence in Array
You are given an array of ‘N’ integers. You need to find the length of the 
longest sequence which contains the consecutive elements.
Example 1:
Input: [100, 200, 1, 3, 2, 4]
Output: 4
Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.
Input: [3, 8, 5, 7, 6]
Output: 4
Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.    */
// Optimal  tc-O(n2);

import java.util.*;

class program33
{
    public static void Logic(int Brr[],int n)
    {
        HashSet<Integer> set = new HashSet<>();
        int len = 0;

        for(int i=0; i<n; i++)
        {
            set.add(Brr[i]);
        }

        for(int it: set)
        {
            if(set.contains(it+1))
            {
                int iCnt = 1;
                int elem = it;

                while(set.contains(elem+1))
                {
                    iCnt++;
                    elem++;
                }
            len = Math.max(len,iCnt);
            }
        }
        System.out.println("The longest sequence length:"+len);
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
