/*  right rotate array by one place

    input -  n = 4     Arr = [1,2,3,4]

    output -  Arr = [4,1,2,3]
 */
import java.util.*;

class program12
{
    public static void rightRotate(int Brr[], int n)
    {
       int temp = Brr[n-1];

        for(int i = n-1; i > 0; i--)
        {
            Brr[i] = Brr[i-1];
        }

        Brr[0] = temp;

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

        rightRotate(Arr,iSize);
    }
}