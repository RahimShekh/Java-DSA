/*
remove duplicates from the sorted array 

Example 1:
input : Arr = [1,1,2,3,3]
output: 1,2,3
*/

import java.util.*;

class program6
{
    public static void Duplicates(int Arr[],int iNo)
    {
        int j= 0;

        System.out.print(Arr[j]+"\t");  // First number is always unique so print it

        for(int i = 1; i < Arr.length; i++)
        {
            if(Arr[i] != Arr[j])          // compare 
            {
                j++;
                Arr[j] = Arr[i];            
                System.out.print(Arr[j]+"\t"); 
            }
            
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of Elements:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < Brr.length; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        Duplicates(Brr,iValue);
    }
}