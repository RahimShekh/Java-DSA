/*
   A
   A B
   A B C
   A B C D
   A B C D E
 */
import java.util.*;

class program13
{
    public static void Pattern(int No)
    {
        
        for(int i = 1; i <= No; i++)
        { 
            char ch = 'A';
           for(int j = 1; j <= i; j++,ch++)
           {
               System.out.print(ch+"\t"); 
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