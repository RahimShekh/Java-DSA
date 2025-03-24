/*
Second largest Element in the array  Arr[] = [2,5,6,34,6,76]

output: 34

Better Approach
*/

import java.util.*;

class program5
{
    public static void Second_Largest(int Arr[], int n)
    {
        int iLarge = 0;
        int Slarge = -1;
        int TLarge = -1;
        for(int i = 0; i < n; i++)
        {
            if(Arr[i] > iLarge)
            {
                iLarge = Arr[i];
            }
        }

        for(int i = 0;i < n;i++)
        {
            if(Arr[i] > Slarge && Arr[i] < iLarge)
            {
                Slarge  = Arr[i];
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(Arr[i] < iLarge && Arr[i] < Slarge && Arr[i] > TLarge)
            {
                TLarge = Arr[i];
            }
        }
        System.out.println("The  Largest:"+iLarge);
        System.out.println("The Second Largest:"+Slarge);
        System.out.println("The Thrid Largest:"+TLarge);

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int No = sobj.nextInt();

        int Brr[] = new int[No];

        for(int i=0; i< No; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        Second_Largest(Brr,No);
       
    }
}