/*    Stock Buy And Sell
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are 
done and the max profit = 0.
tc = O(n)                 */

import java.util.*;

class program5
{
    public static void Logic(int Brr[],int n)
    {
        int minStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++)
        {
            minStock = Math.min(minStock,Brr[i]);
            maxProfit = Math.max(maxProfit,Brr[i]-minStock);

        }

        System.out.println("The max profit:"+maxProfit);
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