/* Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array
without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/

import java.util.*;

class program29
{
    public static void Logic(int Brr[], int n)
    {
        int icnt1 = 0, icnt2 = 0, icnt3 = 0;

        for(int i=0; i<n; i++)
        {
            if(Brr[i] == 0)
            {
                icnt1++;
            }
            else if(Brr[i] == 1)
            {
                icnt2++;
            }
            else{
                icnt3++;
            }
        }

        for(int i=0; i<icnt1; i++)
        {
            Brr[i] = 0;
        }

        for(int i=icnt1; i<icnt1+icnt2; i++) Brr[i] = 1;
        for(int i=icnt1+icnt2; i<n; i++) Brr[i] = 2;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of array:");
        int isize = sobj.nextInt();

        int Arr[] = new int[isize];

        for(int i=0; i<isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,isize);

        for(int it:Arr)
        {
            System.out.print(it+" ");
        }
    }
}