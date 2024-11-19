/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 4  iCol = 4

    output : 1  2   3   4
             1  *   *   4
             1  *   *   4
             1  2   3   4

    Time Complexity : O(2N)

*/
import java.util.*;

public class program35 
{
  public static void Pattern(int iRow,int iCol)
  {
    for(int i = 1; i <= iRow; i++)
    {
        
        for(int j = 1;  j <= iCol; j++)
        {
            if(j == 1 || i == 1 || i == iRow || j == iRow)
            {
                System.out.print(j+"\t");
            }
            else
            {
                System.out.print("*\t");
            }
        }
        System.out.println();
    }
  }
  public static void main(String arg[])
  {
    int iValue1 = 0, iValue2 = 0;

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the rows:");
    iValue1 = sobj.nextInt();

    System.out.println("Enter the columns");
    iValue2 = sobj.nextInt();

    Pattern(iValue1,iValue2);
  }  
}