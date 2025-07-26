/*
    Right rotate the array by one place

    Example1:
    input :  Arr = [1,2,3,4,5]
    output: [5,1,2,3,4]
*/
import java.util.*;

class program10
{
    public static void RightRotate(int Arr[],int iSize)
    {
        int Temp = Arr[iSize-1];

        for(int i = iSize-1; i >= 0; i--)
        {
            Arr[i] = Arr[i-1];
        }
        Arr[0] = Temp;

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

        RightRotate(Brr,iValue);

        for(int i = 0; i < iValue; i++)
        {
            System.out.println("The Right Rotate:"+Brr[i]);
        }
    }
}