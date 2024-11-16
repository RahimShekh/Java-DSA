import java.util.*;

class program9
{
    public static void Pattern(int iNo)
    {
        int iCnt = 0;

        for(iCnt =1; iNo > iCnt; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}