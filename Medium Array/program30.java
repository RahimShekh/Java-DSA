/*  optimised
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

class program30
{
    public static int Logic(int Brr[],int n)
    {
        int sum = n*(n+1)/2;
        int arrSum = 0;

        for(int i=0; i<n; i++)
        {
            arrSum = arrSum + Brr[i];
        }

        return  arrSum -sum;

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i=0; i<iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iMiss = Logic(Arr,iSize);

        System.out.println("The missing no:"+iMiss);
    }
}