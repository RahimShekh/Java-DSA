/*   Find the number that appears once, and the other numbers twice
Example 1:
Input Format: arr[] = {2,2,1}   Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}    Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. 
So, 4 is the answer.
 // Brute Force */

import java.util.*;

class program24
{
    public static void Logic(int Brr[],int n)
    {
        

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
            if(iCnt == 1)
            {
                System.out.println("The No appears once:"+Brr[i]);
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int isize = sobj.nextInt();

        int Arr[] = new int[isize];

        for(int i=0; i<isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,isize);
    }
}