/*
     A
    ABA
   ABCBA
  ABCDCBA
 */
import java.util.*;

class program16
{
    public static void Pattern(int No)
    {
        char ch = 'A';

        for(int i = 0; i < No; i++)
        {
            int breakpoint =(2*i+1)/2;
           //Space
            for(int j = 0; j < No-i-1; j++)
            {
                System.out.print(" ");
            }
            //Chracters
            for(int j = 1 ; j <= 2*i+1; j++)
            {
                System.out.print(ch);
                if(j <= breakpoint)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            //Space
           for(int j = 0; j < No-i-1;j++)
           {
               System.out.print(" "); 
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