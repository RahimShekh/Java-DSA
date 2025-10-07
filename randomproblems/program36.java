/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 5  iCol = 5

    output : $  *   *   *   *  
             #  $   *   *   *
             #  #   $   *   *  
             #  #   #   $   *
             #  #   #   #   $

    Time Complexity : O(2N)

*/
import java.util.*;

public class program36 
{
  public static void Pattern(int iRow,int iCol)
  {
    for(int i = 1; i <= iRow; i++)
    {
        
        for(int j = 1;  j <= iCol; j++)
        {
           if(i >j)
           {
            System.out.print("#\t");
           }
           else if(i == j)
           {
            System.out.print("$\t");
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