/*
    Accept N numbers from user and display all such numbers which contains 3 digits in it.
    Input :  N :  6

        Elements:  8225  665  3   76  953  858  

    Output:  665    953     858

*/
import java.util.*;

class program43
{
    public static void Digit(int Brr[],int iNo)
    {
        int iDigit = 0,iCnt = 0;
        for(int i = 0; i < Brr.length; i++)
        {   
            if(Brr[i] > 100)
            {
                System.out.print(Brr[i]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elemetns:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Digit(Arr,iSize);
    }
}