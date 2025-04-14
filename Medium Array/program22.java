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

class program22
{
    public static void MisingNo(int Arr[], int n)
    {
        int hash[] = new int[n+1];

        int index = 0;

        for(int i = 0; i < n-1; i++)
        {
            int value = Arr[i];  // Get the current value from the array a[]
            hash[value]++;         // increment it if the value appears
            //hash[Arr[i]]++;
        }

        for(int it : hash)
        {
            System.out.print(it+"\t");
        }
        int iMiss = 0;
        for(int i = 1; i < n-1; i++)
        {
            if(hash[i] == 0)
            {
                iMiss = i;
            }
        }

        System.out.print("The mising no:"+iMiss);
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