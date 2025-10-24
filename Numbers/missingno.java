/*
Input Format: N = 5, array[] = {1,2,4,5}
Result:     3
Explanation: 
In the given array, number 3 is missing. So, 3 is the answer.                        

Input Format:
 N = 3, array[] = {1,3}
Result:
 2
Explanation: 
In the given array, number 2 is missing. So, 2 is the answer.
*/

import java.util.*;

class missingno
{
    public static void MisingNo(int Arr[], int n)
    {
        
        int sum = n*(n+1)/2;

        int arrSum = 0;

        for(int i=0; i<n-1; i++)
        {
            arrSum = arrSum + Arr[i];
        }

        System.out.println("The missing no:"+(sum-arrSum));
    }
    public static void main(String arg[])
    {
        Scanner sobj = new  Scanner(System.in);

        System.out.print("Enter the Elements:");
        int No = sobj.nextInt();

        int Brr[] = new int[No];

        for(int i = 0; i < No; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        MisingNo(Brr,No);
    }
}