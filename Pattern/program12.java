/*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
 */
import java.util.*;

class program12
{
    public static void Pattern(int No)
    {
        int Num = 1;
        for(int i = 1; i <= No; i++)
        { 
           for(int j = 1; j <= i; j++,Num++)
           {
               System.out.print(Num+"\t"); 
           }
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