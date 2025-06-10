/*  Left rotate array by one place

    input -  n = 4     Arr = [1,2,3,4]

    output -  Arr = [2,3,4,1]
 */
import java.util.*;

class program10
{
    public static void LeftRotate(int Brr[], int n)
    {
       int temp = Brr[0];

        for(int i = 1; i < n; i++)
        {
            Brr[i-1] = Brr[i];
        }

        Brr[n-1] = temp;

        for(int i = 0; i < n; i++)
        {
            System.out.print(Brr[i]+"\t");
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

        LeftRotate(Arr,iSize);
    }
}