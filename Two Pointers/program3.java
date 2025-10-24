/*
Remove Duplicate From the Sorted Array   Arr[] = [1,1,2,2,3,3]     Sorted

output:  [1,2,3]

optimal
*/
import java.util.*;

class program3
{
    public static void Logic(int Brr[],int n)
    {
        int j=0;

        System.out.print(Brr[j]+" ");
        for(int i=0; i<n-1; i++)
        {
           if(Brr[i] != Brr[i+1])
           {
                j++;
                Brr[j] = Brr[i+1];
                System.out.print(Brr[j]+" ");
           }
            
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,size);
    }
}