/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 4   iCol = 3

    output : *   *   *
             *   *   *
             *   *   *
             *   *   *

    Time Complexity : O(N)
*/
import java.util.*;
public class program22 
{
    public static void Display(int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0;j < iCol; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
{
    int iValue1 = 0,iValue2 = 0;

   Scanner sobj = new Scanner(System.in);

   System.out.println("Enter the rows:");
   iValue1 = sobj.nextInt();

   System.out.println("Enter the coulum:");
   iValue2 =  sobj.nextInt();

   Display(iValue1,iValue2);
}
}
