/*  Left rotate array by K place

    input -  n = 7 , k  = 3   Arr = [1,2,3,4,5,6,7]

    output -  Arr = [4,5,6,7,1,2,3]

    //Brute Force
*/
import java.util.*;

class program11
{
    public static void LeftRotate(int Brr[], int n,int k)
    {
       k = k % n; //agar k ki value length se jyada hogi tab yeh formula use karo

       int temp[] = new int[k];

       for(int i = 0; i < k; i++)
       {
            temp[i] =  Brr[i];
       }

       for(int i = k; i < n; i++)
       {
            Brr[i-k]  = Brr[i];
       }

       for(int i = n-k,j = 0; i < n; i++,j++)
       {
            Brr[i]  = temp[j];
       }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Elements:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < iSize;  i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.print("Enter the No ot roatate:");
        int No = sobj.nextInt();

        LeftRotate(Arr,iSize,No);

        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}