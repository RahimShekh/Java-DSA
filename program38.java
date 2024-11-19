 /*
Accept N numbers from user and return difference between summation of even elements and 
summatin of odd elements.

Input :  N :  6
         Elements: 85   66  3   80  93  88

Output: 53  (234-181)

*/
import java.util.*;
class program38
{
    public static void EvenOdd(int Brr[],int iNo)
    {
        int iSum = 0, iSum1 = 0;
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] % 2 == 0)
            {
                iSum = iSum + Brr[i]; 
            }
            else
            {
                iSum1 = iSum1 + Brr[i];
            }
        }
        System.out.println("The Difference:"+(iSum - iSum1));
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter the no of elements:");
        iSize = sobj.nextInt();

       int Arr[] = new int[iSize];
       
       for(int i = 0; i < iSize; i++)
       {
        Arr[i] = sobj.nextInt();
       }

       EvenOdd(Arr,iSize);
    }
}