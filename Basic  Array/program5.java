
/*
    Accept N numbers from user and accept one another number as NO,return index of last occurance 
    of that NO.
    Input :  N :  6

            No : 66

        Elements: 85   66  3  66  93  88  

    Output: 3

    Input :  N :  6

            No : 12

        Elements: 85  11    3   15  11  111 

    Output:  -1
*/

import java.util.*;

class program5
{
    public static int Search(int Brr[], int num)
    {
        int iCnt = 0;

        for(int i = 0; i< Brr.length; i++)
        {
            if(Brr[i] == num)
            {
                iCnt = i;
            }
        }
        return iCnt;
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

        int iNdex = Search(Arr,iNo);

        System.out.println("the index of that element:"+iNdex);
    }
}