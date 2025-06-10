import java.util.*;

class insertion
{
    public static void Insertion_Sort(int Brr[], int n)  // n is the size
    {
       for(int i = 0;i <= n-1; i++)
       {
            int j = i;

            while(j > 0  && Brr[j-1] > Brr[j])
            {
                int temp = Brr[j];
                Brr[j] = Brr[j-1];
                Brr[j-1] = temp;

                j--;
            }

       }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the no of Elements:");
        int iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(int i = 0; i < iNo; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Insertion_Sort(Arr,iNo);

        System.out.println("Sorting:");
        for(int i = 0; i < iNo; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}