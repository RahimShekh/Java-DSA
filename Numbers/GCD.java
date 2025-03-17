/*
   No1 = 9    No2 = 12

    find greatest comon divisior

    Factors of 9 = 1,3,9
    Factors of 12 = 1,2,6,12,3,4

    So the Common Divisior is 3 so answer should be 3.
 */
import java.util.*;

class GCD
{
    public static void Logic(int iNo1, int iNo2)
    {
        int iDiv  = 0;
        for(int i = 1; i < iNo1; i++)
        {
            if((iNo1 % i == 0) && (iNo2 % i == 0))
            {
                iDiv =  i;
            }
        }
        System.out.println("The common Divisior:"+iDiv);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int No1 = sobj.nextInt();

        System.out.println("Enter the Second Number:");
        int No2 = sobj.nextInt();

        Logic(No1,No2);
    }
}