import java.util.*;

class Program1
{
    public static void Divisible(int Brr[])
    {
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] % 5 == 0)
            {
                System.out.println("Divisible by :"+Brr[i]);
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(int i  = 0; i < iNo; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Divisible(Arr);
    }
}