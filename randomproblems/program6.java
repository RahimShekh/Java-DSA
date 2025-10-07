import java.util.*;

class program6
{
    public static void Pattern(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        @SuppressWarnings("unused")
        int iValue = 0;
        System.out.print("Enter the number:");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}