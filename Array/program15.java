/*
    Maximum sum of subarray of size k

    input:  Size = 7 ,  k = 3
    Arr = [2,5,1,8,2,9,1]

    output: 19
*/
import java.util.*;
class program15
{
    public static void MaximumSubarray(int Arr[],int iSize,int k)
    {
        int i = 0,j = 0;
        int iSum = 0,iMax = 0; // if no are -ve in arr then intilise imax with Integer.MIN_VALUE;

        while(j < iSize)    // loop until j reach end of array
        {
            iSum = iSum + Arr[j];

            if(j-i+1 < k)   // check if we have hit the window size k
            {
                j++;
            }
            else if(j-i+1 == k)  // We have a valid window, check if it's the maximum sum
            {
                iMax = Math.max(iMax,iSum);

                // slide the window
                iSum = iSum - Arr[i];       

                j++;
                i++;
            }
        }

        System.out.println("The Maximum of sub Array:"+iMax);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        MaximumSubarray(Brr,iValue,3);
    }
}