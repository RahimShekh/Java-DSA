/*
    Accept N numbers from user and accept one another number as NO,check whether NO is present or
    not.

    Input :  N :  6

            No : 66

        Elements: 85   66  3  66  93  88  

    Output: TRUE
*/
import java.util.*;

class program3
{
    public static void Search(int Brr[], int num)
    {
        Boolean bFlag = false;

        for(int i = 0; i< Brr.length; i++)
        {
            if(Brr[i] == num)
            {
                bFlag = true;
            }
        }
        
        if(bFlag == true)
        {
            System.out.println("the element is present");
        }
        else
        {
            
        System.out.println("The Element is not present");
        }
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

        Search(Arr,iNo);
    }
}