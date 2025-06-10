import java.util.*;

class Selection
{
    public static void Selection_Sort(int Brr[])
    {
        for(int i = 0; i < Brr.length-1; i++)

        {
            int iMini = i;

            for(int j = i; j <=Brr.length-1; j++)
            {
                if(Brr[iMini] > Brr[j])   // traveling the array to end to find the smallest element
                {
                    iMini = j;
                }
                
            }
            int temp  = Brr[iMini];
            Brr[iMini] = Brr[i];
            Brr[i] = temp;
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

        Selection_Sort(Arr);

        System.out.println("Sorting:");
        for(int i = 0; i < iNo; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}