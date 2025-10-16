/*Find the Majority Element that occurs more than N/2 times
Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation: When we just count the occurrences of each number and compare with half 
of the size of the array, you will get 3 for the above solution. 
Example 2:
Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}
Result: 2
Explanation: After counting the number of times each element appears and comparing it 
with half of array size, we get 2 as result.
Example 3:
Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}
Result: 4 
*/

import java.util.*;

class program4
{
    public static int Logic(int Brr[],int n)
    {
        int halfLen = n/2;

        for(int i=0; i<n; i++)
        {
            int iCnt = 0;

            for(int j=0; j<n; j++)
            {
                if(Brr[i] == Brr[j])
                {
                    iCnt++;
                }
            }
            if(iCnt > halfLen)
            {
                return Brr[i];
            }
        }
        return -1;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int isize = sobj.nextInt();

        int Arr[] = new int[isize];

        for(int i=0; i<isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int elem = Logic(Arr,isize);

        System.out.println("The majority element:"+elem);
    }
}
