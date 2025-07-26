/*
Check if Array is Sorted or not    Arr[] = [2,4,5,7,8]     Sorted
                                   Arr[] = [4,2,34,1,4]    Not sorted
optimal
*/

import java.util.*;

class program8
{
    public static void Logic(int Brr[],int n)
    {
        boolean bFlag = true;

        for(int i=1; i < n; i++)
        {
            if(Brr[i] < Brr[i-1])
            {
                bFlag = false;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is not Sorted");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i=0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,iSize);
    }
}