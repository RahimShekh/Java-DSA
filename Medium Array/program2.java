/*
Largest Element in an array

Arr[] = [3,2,1,5,2]

output: 5

Two ways to solve this problem using brute force way and by sorting
time comeplexity:  nlogn

// brute force better for this question not sorting
*/
import java.util.*;

class program2
{
    public static void Largest(int Arr[], int n)
    {
        for(int i = 0; i <= n-2; i++)
        {
            int Min = i;

            for(int j = i; j <= n-1; j++)
            {
                if(Arr[Min] > Arr[j])
                {
                    Min = j;
                }
            }
            int temp = Arr[Min];
            Arr[Min] = Arr[i];
            Arr[i] = temp;
        }

        System.out.println("The Largest Element:"+Arr[n-1]);
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

        System.out.println("After Sorting:");
        for(int i = 0; i < No; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}