/*
    Left rotate the array by one place

    Example1:
    input :  Arr = [1,2,3,4,5]
    output: [2,3,4,5,1]
*/

import java.util.*;

class program9
{
    public static void LeftRotate(int Arr[],int iNo)
    {
        int Temp = Arr[0];

        for(int i = 1; i < Arr.length; i++)
        {
            Arr[i-1] = Arr[i];
        }
        Arr[iNo-1] = Temp;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No Elements:");
        int iSize = sobj.nextInt();

        int Brr[] = new int[iSize];

        for(int i = 0; i < Brr.length; i++)
        {
            Brr[i] = sobj.nextInt(); 
        }

        LeftRotate(Brr,iSize);

        System.out.println("The Array Left Rotate:");
        
        for(int i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}