//Optimal Approach

import java.util.*;

class program6
{
    public static int Search(int Brr[], int num)
    {
        for(int i = Brr.length-1; i >= 0; i--)
        {
            if(Brr[i] == num)
            {
                return i;
            }
        }
        return -1;
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