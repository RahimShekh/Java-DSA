/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 3   iCol = 4

    output : 1  2   3   4
             5  6   7   8
             9  10  11  12

    Time Complexity : O(N)

*/
import java.util.*;
public class program29 
{
    public static void Pattern(int iRow,int iCol)
    {
        int iCnt = 1;
        for(int i = iRow;i >= 1;i--)
        {
            for(int j = 1;j <= iCol; j++)
            {
                System.out.print(iCnt+"\t");
                iCnt++;
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter the Rows");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the columns");
        iValue2 = sobj.nextInt();

        Pattern(iValue1,iValue2);
    }    
}

