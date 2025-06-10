/*
    Accept N numbers from user and display summation of digits of each number. 
    Input :  N :  6

        Elements:  8225  665  3   76  953  858  

    Output: 17  17  3 13 17  21

*/
import java.util.*;

class program8
{
    public static void Summation(int Brr[])
    {
        
        for(int i = 0; i < Brr.length; i++)
        {
            int iSum = 0;
            int iValue = Brr[i];
            while(iValue > 0)
            {
                int iDigit = iValue % 10;
                iSum = iSum + iDigit;
                iValue = iValue/10;
            }

            System.out.print(iSum+"\t");
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

        Summation(Arr);
    }
}