import java.util.*;

public class program14
{
    public static void Pattern(int iNo)
    {
        int iCnt = 1;
        
        for(iCnt = 10; iCnt >0; iCnt--)
        {
            System.out.print(iCnt*iNo+"\t");
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
