/*
  A
  BB
  CCC
  DDDD
  EEEEE
 */
import java.util.*;

class program15
{
    public static void Pattern(int No)
    {
        char ch = 'A';

        for(int i = 1; i <= No; i++)
        { 
           for(int j = 1; j <= i; j++)
           {
               System.out.print(ch+"\t"); 
           }
           ch++;
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int no = sobj.nextInt();

        Pattern(no);
    }
}