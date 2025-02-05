/*
    Accept N numbers from user and accept one another number as NO,return frequency of NO from it.

    Input :  N :  6

            No : 66

        Elements: 85   66  3  66  93  88  

    Output: 2
*/
import java.util.*;

class program2
{
    public static void Search(int Brr[], int num)
    {
        int iCnt = 0;

        for(int i = 0; i< Brr.length; i++)
        {
            if(Brr[i] == num)
            {
                iCnt++;
            }
        }

        System.out.println("The frequency of number:"+iCnt);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        int Arr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the No to Search:");
        int iNo = sobj.nextInt();

        Search(Arr,iNo);
    }
}