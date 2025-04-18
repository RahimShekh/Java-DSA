/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 3   iCol = 4

    output : 1  1   1   1
             2  2   2   2
             3  3   3   3
             4  4   4   4   

    Time Complexity : O(N)
*/
import java.util.*;

class program25
{
    public static void Pattern(int iRow,int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1;j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter the Rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Column:");
        iValue2 = sobj.nextInt();

        Pattern(iValue1,iValue2);
    }
}