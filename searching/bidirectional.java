import java.util.*;

class bidirection
{
    public static void BidiSearch(int Brr[],int iNo)
    {
        int iStart = 0, iEnd = Brr.length-1;

        while(iStart < Brr.length)
        {
            if(Brr[iStart] == iNo || Brr[iEnd] == iNo)
            {
                System.out.println("The Element is Present");
                return;
            }
            iStart++;
            iEnd--;

        }
        System.out.println("The Element is not Present");
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter No For Search:");
        int iSearch = sobj.nextInt();

        BidiSearch(Arr,iSearch);
    }
}