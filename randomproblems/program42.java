/*
    Accept N numbers from user and accept one another number as NO,return index of last occurance of that NO.

    Input :  N :  6

            No : 66

        Elements: 85   66  3  66  93  88  

    Output: 3

    Input :  N :  6

            No : 93

        Elements: 85  66  3  66  93  88  

    Output: 4


    Input :  N :  6

            No : 12

        Elements: 85  11    3   15  11  111 

    Output:  -1
*/
import java.util.*;

class program42
{
    public static void CheckNo(int Brr[],int iNo,int SNo)
    {
        int index = -1;
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] == SNo)
            {
                
                index = i;
            }
        
        }
        System.out.println("The index:"+index);
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the No to Chk index:");
        int No = sobj.nextInt();

        CheckNo(Arr,iSize,No);
    }
}