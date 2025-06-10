import java.util.*;

class bubble
{
    public static void Bubble_Sort(int Brr[], int n)  // n is the size
    {
       for(int i = n-1; i>=1; i--)
       {
        for(int j = 0; j <= i-1; j++)
        {
            if(Brr[j] > Brr[j+1])
            {
                //swap
                int temp = Brr[j];
                Brr[j] = Brr[j+1];
                Brr[j+1] = temp;
            }
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

        Bubble_Sort(Arr,iNo);

        System.out.println("Sorting:");
        for(int i = 0; i < iNo; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}