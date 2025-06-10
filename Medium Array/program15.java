/*  right rotate array by K place

    input -  n = 7 , k  = 3   Arr = [1,2,3,4,5,6,7]

    output -  Arr = [5,6,7,1,2,3,4]

    //optimal
 */
import java.util.*;

class program15
{
    public static void rightRotate(int Brr[], int Start,int End)
    {
        while(Start <= End)
        {
            int temp =  Brr[Start];
            Brr[Start] = Brr[End];
            Brr[End]  = temp;

            Start++;
            End--;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Elements:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < iSize;  i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.print("Enter the No ot roatate:");
        int k = sobj.nextInt();

        rightRotate(Arr,0,iSize-1);
        rightRotate(Arr,0,k-1);
        rightRotate(Arr,k,iSize-1);
       


        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}