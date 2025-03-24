/*
Second largest Element in the array  Arr[] = [2,5,6,34,6,76]

output: 34

optimal*/

import java.util.*;

class program6
{
    public static void Second_Largest(int Arr[], int n)
    {
        int iLarge = Arr[0];
        int SLarge = -1;
        
        for(int i = 0; i < n; i++)
        {
            if(Arr[i] > iLarge)
            {
                SLarge = iLarge;
                iLarge = Arr[i];
            }
            else if(iLarge > Arr[i] && SLarge < Arr[i])
            {
                SLarge = Arr[i];
            }
        }
        System.out.print("Second Largest:"+SLarge);

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