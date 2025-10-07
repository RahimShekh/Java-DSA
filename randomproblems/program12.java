import java.util.*;

public class program12
{
    public static void Pattern(int iNo)
    {
        int iCnt = 1;

        while(iCnt <= 10)
        {
            System.out.print(iNo*iCnt+"\t");
            iCnt++;
        }
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
