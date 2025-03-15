/*
  
   A B C D E
   A B C D
   A B C
   A B
   A
 */
import java.util.*;

class program14
{
    public static void Pattern(int No)
    {
        
        for(int i = 1; i <= No; i++)
        { 
            char ch = 'A';
           for(int j = 1; j <= No-i+1; j++,ch++)
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