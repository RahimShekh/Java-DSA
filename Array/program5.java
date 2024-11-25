/*
Check the Array is Sorted or not if it is Sorted return true or return false

Example 1:
input : nums =[1,2,2,3,3,4]
output: True

Example 2:
input : nums =[1,2,3,1,2]
output: False;
*/
import java.util.*;

class program5
{
    public static void SortedArray(int Arr[],int iSize)
    {
        boolean bFlag = false;

        for(int i = 1; i < Arr.length; i++)
        {
            if(Arr[i] >= Arr[i-1])
            {
                bFlag = true;
            }
        }

        if(bFlag == true)
        {
            System.out.println("The Array is Sorted");
        }
        else
        {
            System.out.println("The Array is not Sorted");
        }
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no of Elements");
        int iValue = sobj.nextInt();
        
        int Brr[] = new int[iValue];

        for(int i = 0; i < iValue;i++)
        {
            Brr[i] = sobj.nextInt();
        }

        SortedArray(Brr,iValue);
    }
}