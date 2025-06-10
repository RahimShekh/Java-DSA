// Reverse the array

import java.util.*;

class program8
{
    public static void Reverse(int Arr[],int iSize)
    {
        int iEnd  = iSize-1;
        int temp =  0;

        for(int i = 0; i < iSize/2; i++)
        {
            temp = Arr[i];
            Arr[i] = Arr[iEnd];
            Arr[iEnd] = temp;

            iEnd--;
        }

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No of Elements:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < Brr.length; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        Reverse(Brr,iValue);

        System.out.println("Reversed array is:");

        for(int i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}