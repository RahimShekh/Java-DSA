/*
Remove Duplicate From the Sorted Array   Arr[] = [1,1,2,2,3,3]     Sorted

output:  [1,2,3]

optimal
*/
import java.util.*;

class program9
{
    public static void Duplicate(int Arr[], int n)
    {
        int j = 0;

        System.out.print(Arr[j]+" ");
        for(int i = 1; i < n; i++)
        {
            if(Arr[i] != Arr[i-1])
            {
                j++;
                Arr[j] = Arr[i];
                System.out.print(Arr[j]+" ");
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int No = sobj.nextInt();

        int Brr[] = new int[No];

        for(int i=0; i< No; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        Duplicate(Brr,No);
    }
}