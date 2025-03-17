/*
    6 = 1  + 2 +  3 
        = 6
    So  it is a perfect number  also  28 & 496 is also perfect number.
 */
import java.util.*;

class perfect
{
    public static void Logic(int iNo)
    {
        int iSum = 0;
        for(int i = 1; i < iNo; i++)
        {
            if(iNo % i == 0)
            {
                iSum =  iSum + i;
            }
        }
        if(iSum == iNo)
        {
            System.out.println("It is perfect number");
            return;
        }
        System.out.println("It is not perfect number");
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int No = sobj.nextInt();

        Logic(No);
    }
}