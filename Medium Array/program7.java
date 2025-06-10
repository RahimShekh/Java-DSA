/*
Second minimum Element in the array  Arr[] = [2,5,6,34,6,76]

output: 5

optimal - O(n)
*/

import java.util.*;

class program7
{
    public static void Second_Largest(int Arr[], int n)
    {
        int iMin = Arr[0];
        int SMin = 1000;
        
        for(int i = 0; i < n; i++)
        {
            if(Arr[i] < iMin)
            {
                SMin = iMin;
                iMin = Arr[i];
                
            }
            else if(iMin < Arr[i] && SMin > Arr[i])
            {
                SMin = Arr[i];
            }
        }
        System.out.print("Second Smallest:"+SMin);

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