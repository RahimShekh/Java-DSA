/*
Remove Duplicate From the Sorted Array   Arr[] = [1,1,2,2,3,3]     Sorted
output:  [1,2,3]
better
*/
import java.util.*;

class program
{
    public static void Logic(int Brr[],int n)
    {
        int ans[] = new int[n/2];

        int val = 0;

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(Brr[i] == Brr[j])
                {
                    ans[val] = Brr[i];
                    val++;
                }
            }
        }

        for(int it : ans)
        {
            System.out.print(it+" ");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Logic(arr,size);
    }
}