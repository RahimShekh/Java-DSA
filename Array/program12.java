/*  Left rotate array by  D  places

    Example 
    input = Arr[1,2,3,4,5]
    output = [4,5,1,2,3]

*/
import java.util.*;

class program12
{
    public static void LeftRotate(int Arr[],int iSize,int iLeft)
    {
        int iStart = 0;      
        int iEnd = iLeft-1;

        while(iStart < iEnd)       // 0 < 2
        {
            int Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;
           
            iStart++;
            iEnd--;
        }

        iStart = iLeft;
        iEnd = iSize-1;

        while(iStart < iEnd)   // 3 < 6
        {
            int Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;
            iStart++;
            iEnd--;
        }

        iStart = 0;
        iEnd = iSize-1;

        while(iStart < iEnd)  // 0 < 6
        {
            int Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;

            iStart++;
            iEnd--;
        }

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No of Elemetns:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        System.out.print("Enter the No to Reverse:");
        int isub = sobj.nextInt();

        LeftRotate(Brr,iValue,isub);

        for(int i = 0; i < iValue; i++)
        {
            System.out.print("|"+Brr[i]+"|");
        }
    }
}