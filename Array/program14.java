/*  MOVE ALL THE ZERO IN THE END OF ARRAY

Example:
Input:    1 ,0 ,2 ,3 ,0 ,4 ,0 ,1

Output:   1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

Two Pointer technique
*/
import java.util.*;

class program14
{
    public static void MoveEnd(int Arr[],int iNo)
    {
        int j = 0;
        
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != 0)
            {
                int temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;

                j++;
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No Elements:");
        int iSize = sobj.nextInt();

        int Brr[] = new int[iSize];

        for(int i = 0; i < Brr.length; i++)
        {
            Brr[i] = sobj.nextInt(); 
        }

        MoveEnd(Brr,iSize);

        System.out.println("The Array:");
        
        for(int i = 0; i < Brr.length; i++)
        {
            System.out.print("|"+Brr[i]+"|");
        }
    }
}