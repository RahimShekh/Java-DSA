//reverse array using recrusion

//there is no inbuild swap method in java
import java.util.*;

class program8
{
    static int iCnt = 0;
    public static void Logic(int Brr[],int iStart, int iEnd)
    {

        if(iStart <= iEnd)
        {
        int Temp = Brr[iStart];
            Brr[iStart] = Brr[iEnd];
            Brr[iEnd] = Temp;

            iStart++;
            iEnd--;

            Logic(Brr,iStart,iEnd);
        }
    }
    public static void main(String arg[])
    {
        Scanner  sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(int i = 0; i < iNo; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr, 0,Arr.length-1);

         for(int i = 0; i < iNo; i++)
        {
            System.out.println(Arr[i]);
        }

    }
}