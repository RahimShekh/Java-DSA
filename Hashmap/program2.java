/* Count subarray with given sum equal to k
Example 1:
Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
Result: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

Example 2:
Input Format: N = 3, array[] = {1,2,3}, k = 3
Result: 2
Explanation: The subarrays that sum up to 3 are [1, 2], and [3].
*/

import java.util.*;

class program2{

    public static int Logic(int Brr[],int n,int target)
    {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0,1);  // agar sum -k = 0 hoga toh count 1 hoga
       for(int i=0; i<n; i++)
       {
            preSum = preSum + Brr[i];

            int remove = preSum -target;

            cnt = cnt + mpp.getOrDefault(remove,0); // count will increase here

            mpp.put(preSum,mpp.getOrDefault(preSum,0)+1);
       }
       return cnt;
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

        System.out.println("the count of subarray:"+max);
    }
}