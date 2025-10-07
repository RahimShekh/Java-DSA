/*
    Accept N numbers from user and check whether that numbers contains 11 in it or not.
    Input :  N :  6
        Elements: 85   66  11   80  93  88  

    Output: 11 is present

    Input :  N :  6
        Elements: 85   66  3   80  93  88  

    Output: 11 is absent
*/
import java.util.*;

class program39
{
    public static void CheckArr(int Brr[], int iNo)
    {
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] == 11)
            {
                System.out.println("11 is Present");
                return;
            }
        }
        System.out.println("11 is absent");
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter the Elements:");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        CheckArr(Arr,iSize);
    }
}
