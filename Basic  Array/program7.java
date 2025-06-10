/*
    Accept N numbers from user and display all such numbers which contains 3 digits in it.
    Input :  N :  6

        Elements:  8225  665  3   76  953  858  

    Output:  665    953     858

*/
import java.util.*;

class program7
{
    public static void ThreeDigit(int Brr[])
    {
        
        for(int i = 0; i < Brr.length; i++)
        {
            int iCnt = 0;
            int iValue = Brr[i];
            while(iValue > 0)
            {
                iValue = iValue/10;
                iCnt++;
            }

            if(iCnt == 3)
            {
                System.out.println("The three Digit Elements:"+Brr[i]+"\t");
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(int i = 0; i < iNo; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ThreeDigit(Arr);
    }
}