/*
Remove Duplicate From the Sorted Array   Arr[] = [1,1,2,2,3,3]     Sorted

output:  [1,2,3]

optimal
 */
import java.util.*;

class program9
{
    public static int Duplicate(int Arr[], int n)
    {
        int i = 0;

        for(int j = 1; j < n; j++)
        {
            if(Arr[i] != Arr[j])
            {
                Arr[i+1] = Arr[j];
                i++;
            }
        }
      
       return i+1;  // returning the index
       return i+1;
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

        int newLength = Duplicate(Brr,No);

        for(int i=0; i< newLength; i++)
        {
            System.out.print(Brr[i]+" ");
        }
    }
}