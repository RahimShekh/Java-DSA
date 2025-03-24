/*
Second largest Element in the array  Arr[] = [2,5,6,34,6,76]

output: 34

Brute Force
*/

import java.util.*;

class program4
{
    public static void Second_Largest(int Arr[], int n)
    {
        for(int i = n-1; i >=1; i--)
        {
            for(int j = 0; j <= i-1; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        int SLarge = 0;
        for(int i = n-2; i >=0; i--)
        {
            
            if(Arr[i] != Arr[n-1])
            {
                SLarge = Arr[i];
                break;
            }
        }

        System.out.println("The Second Largest Element:"+SLarge);
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

        System.out.println("Array after Sorting:");
        for(int i=0; i< No; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}