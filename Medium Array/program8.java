/*
Check if Array is Sorted or not    Arr[] = [2,4,5,7,8]     Sorted
                                   Arr[] = [4,2,34,1,4]    Not sorted
optimal
 */
import java.util.*;

class program8
{
    public static boolean Sorted(int Arr[], int n)
    {

       for(int i = 1; i < n; i++)
       {
            if(Arr[i] >= Arr[i-1])
            {
                return true;
            }
            else
            {
                return false;
            }
       }
       
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int No = sobj.nextInt();

        int Brr[] = new int[No];

        for(int i=0; i< No; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        boolean bFlag = Sorted(Brr,No);

         if(bFlag == true)
        {
            System.out.print("The Array is  Sorted");
        }
       else
        {
            System.out.print("The Array is not Sorted");
        }
       
    }
}