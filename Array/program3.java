//optimal Solution

import java.util.*;

class program3
{
    public static void SecondLarge(int Arr[],int iSize)
    {
        int iLarge = Arr[0];
        int sLarge = 0;

        for(int i =0;i < Arr.length; i++)
        {
            if(Arr[i] > iLarge)
            {
                sLarge = iLarge;
                iLarge = Arr[i];
            }
            else if((Arr[i] != iLarge) && (Arr[i] > sLarge)) 
            {
                sLarge =  Arr[i];
            }
        
        } 

        System.out.println("The Second Largest Element:"+sLarge);
    }
    public static void main(String arg[])
    {
        Scanner sobj  = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the no of Elements:");
        iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        SecondLarge(Brr,iValue);
    }
}