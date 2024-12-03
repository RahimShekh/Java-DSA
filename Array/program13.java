/*    
    Right Roatate the array by k places

    optimal solution
    
    Ex-  
    input -  Arr= [1,2,3,4,5]

    output -  [4,5,1,2,3]
*/

import java.util.*;
class program13
{
    public static void RightRotate(int Arr[],int iSize,int iRight)
    {
        int iStart = 0,iEnd = iSize-1;
        int Temp = 0;

        while(iStart < iEnd)
        {
            Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;

            iStart++;
            iEnd--;
        }

        iStart = 0;
        iEnd = iRight-1;

        while(iStart < iEnd)
        {
            Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;

            iStart++;
            iEnd--; 
        }

        iStart = iRight;
        iEnd = iSize-1;

        while(iStart < iEnd)
        {
            Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;

            iStart++;
            iEnd--; 
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No of Elements:");
        int iValue = sobj.nextInt();

        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        System.out.println("Enter the No to Rotate:");
        int iRotate = sobj.nextInt();

        RightRotate(Brr,iValue,iRotate);

        for(int i = 0; i < iValue; i++)
        {
            System.out.print("|"+Brr[i]+"|");
        }
    }
}