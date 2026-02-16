/*
you are give a array modify that array if the array have the last digit element 8 then put
-8 if that element is less that 59 then -3 if the element is both then -1.

arr = [23,48,55,98,64]

ans = [-3,-8,55,-8,64]
*/

import java.util.*;

class test
{
    public static void Logic(int brr[],int n)
    {
        for(int i=0; i<n; i++)
        {
            int iNo = brr[i];
            int lessNo = brr[i];
            int iDigit = 0;
            
            if(brr[i] < 59)
            {
                brr[i] = -3;
                System.out.println("it is cool number");
            }
            while(iNo != 0)
            {
               iDigit = iNo % 10;

               if(iDigit == 8)
               {
                 brr[i] = -8;
                 System.out.println("This is warm number");
                 break;
               }    
               iNo = iNo/ 10;
            }

            if(iDigit == 8 && lessNo < 59)
            {
                System.out.println("They are both");
                brr[i] = -1;
            } 
        }
    }
    public static void main(String arg[])
    {
        System.out.println("hello world");
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();
        
        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Logic(arr,size);

        for(int it: arr)
        {
            System.out.print(it+" ");
        }
    }
}