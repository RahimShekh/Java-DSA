/*  TWO POINTER
Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.
*/
//Two sum problem
//optimal

import java.util.*;

class program1
{
    public static int[] Logic(int Brr[],int n,int target)
    {

       int start = 0, end = n-1;
       int sum = 0;

       int temp[] = new int[2];

       while(start <= end)
       {
              sum = Brr[start] + Brr[end];

              if(sum == target)
              {
                     temp[0] = start;
                     temp[1] = end;
                     return temp;
              }
              else if(sum < target)
              {
                  start++;
                    
              }
              else
              {
                  end--; 
              }
       }
       return temp;
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

        System.out.println("Enter the target:");
        int k = sobj.nextInt();

        int result[] = Logic(Arr,isize,k);

        System.out.println("The Sum of indexes:"+result[0]+" "+result[1]);
    }
}