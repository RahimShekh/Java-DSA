/*
Remove Duplicate From the Sorted Array   Arr[] = [1,1,2,2,3,3]     Sorted

output:  [1,2,3]
optimal
*/
import java.util.*;

class program39
{
    public static void Logic(int Brr[],int n)
    {
        int j=0; 
        
        for(int i=0; i<n-1; i++)
        {
            if(Brr[i] == Brr[i+1])
            {
                j++;
                Brr[j] = Brr[i];
                System.out.print(Brr[j]+" ");
            }
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