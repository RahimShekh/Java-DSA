/*
Largest Element in an array

Arr[] = [3,2,1,5,2]

output: 5

//optimal
*/
import java.util.*;

class program3
{
    public static void Largest(int Arr[], int n)
    {
        int iLarge = Arr[0];
        for(int i = 0; i < n; i++)
        {
            if(Arr[i] > iLarge)
            {
                iLarge = Arr[i];
                break;
            }
        }

        System.out.println("The Largest Element:"+iLarge);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int No = sobj.nextInt();

        int Brr[] = new int[No];

        for(int i = 0; i < No; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        Largest(Brr,No);

    }
}