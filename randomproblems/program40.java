/*
    Accept N numbers from user and accept one another number as NO,return frequency of NO from it.

    Input :  N :  6

            No : 66

        Elements: 85   66  3  66  93  88  

    Output: 2

    Input :  N :  6

            No : 12

        Elements: 85  11  3  15 11  111  

    Output: 0

*/
import java.util.*;

class program40
{
    public static void CheckNo(int Brr[],int iNo,int SNo)
    {
        int iCnt = 0;
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] == SNo)
            {
                iCnt++;
            }
        }
        System.out.println("The Frequency of "+SNo+" is "+iCnt);
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the No to Chk Frequency:");
        int No = sobj.nextInt();

        CheckNo(Arr,iSize,No);
    }
}