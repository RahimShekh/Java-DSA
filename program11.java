import java.util.*;

public class program11
{
    public static void Pattern(int iNo)
    {
        int iCnt = 0,iMult = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iMult = iMult *iCnt; 
        }
        System.out.println("The multiplication:"+iMult);
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}
