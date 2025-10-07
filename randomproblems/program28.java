/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 4   iCol = 5

    output : 4  4   4   4   4
             3  3   3   3   3
             2  2   2   2   2
             1  1   1   1   1

    Time Complexity : O(N)
*/
import java.util.*;
public class program28 
{
    public static void Pattern(int iRow,int iCol)
    {

        for(int i = iRow;i >= 1;i--)
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

        System.out.println("Enter the Rows");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the columns");
        iValue2 = sobj.nextInt();

        Pattern(iValue1,iValue2);
    }    
}

