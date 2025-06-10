import java.util.*;

class binarysearch
{
    public static void BinarySearch(int Brr[],int iValue)
    {
        int iStart = 0, iEnd = Brr.length-1;
        int iMid = 0;

        while(iStart <= iEnd)
        {
            iMid = iStart +(iEnd - iStart)/2;

            if(Brr[iMid] == iValue)
            {
                System.out.println("The Element is Present");
                return;
            }
            else if(iValue > Brr[iMid])
            {
                iStart = iMid+1;
            }
            else if(iValue < Brr[iMid])
            {
                iStart = iMid-1;
            }
        }

        System.out.println("The Element is Not present");
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i=0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the No fo search:");
        int iSearch = sobj.nextInt();

        BinarySearch(Arr,iSearch);
    }
}