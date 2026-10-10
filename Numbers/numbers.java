/*
you are given a array modify that array if the array have the last digit element 8
then put -8 if that element is less that 59 then -3 if the element is both then -1.

arr = [23,48,55,98,64]

ans = [-3, -1, -3, -8, 64]
*/


import java.util.*;

class numbers
{
    public static void Logic(int brr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int lastDigit = brr[i] % 10;

            if(lastDigit == 8 && brr[i] < 59)
            {
                brr[i] = -1;
            }
            else if(lastDigit == 8)
            {
                brr[i] = -8;
            }
            else if(brr[i] < 59)
            {
                brr[i] = -3;
            }
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Logic(arr, size);

        for(int it : arr)
        {
            System.out.print(it + " ");
        }

        sobj.close();
    }
}