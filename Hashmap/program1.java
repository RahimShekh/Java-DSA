/* Longest subarray with sum k (positives and negatives)
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3. 
*/  // tc = O(n)

import java.util.*;

class program1{

    public static int Logic(int Brr[],int n,int target)
    {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0; i<n; i++)
        {
            sum = sum + Brr[i];

            if(sum == target)
            {
                maxLen = Math.max(maxLen,i+1);
            }

            int rem = sum -target;

            if(mpp.containsKey(rem))
            {
                int length = i - mpp.get(rem);
                maxLen = Math.max(maxLen,length);
            }

            if(!mpp.containsKey(sum))
            {
                mpp.put(sum,i);  // store sum and index in hashmap
            }
        }
        return maxLen;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sobj.nextInt();

        int max = Logic(Arr,size,k);

        System.out.println("Longest length of subarray:"+max);
    }
}