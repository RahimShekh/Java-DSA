/*  right rotate array by k place

    input -  n = 7  k = 3   Arr = [1,2,3,4,5,6,7]

    output -  Arr = [5,6,7,1,2,3,4]
 */
import java.util.*;

class program13
{
    public static void rightRotate(int Brr[], int n,int k)
    {
        k = k % n;

        int temp[] = new int[k];

        for(int i = n-k,j = 0; i < n; i++, j++)
        {
            temp[j] = Brr[i];
        }

        for(int i = n-1; i >=k; i--)  // shifting elments from last index
        {
            Brr[i] = Brr[i-k];
        }

        for(int i = 0; i < k; i++)
        {
            Brr[i] = temp[i];
        }

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

        System.out.print("Enter the No:");
        int No = sobj.nextInt();

        rightRotate(Arr,iSize,No);
    }
}