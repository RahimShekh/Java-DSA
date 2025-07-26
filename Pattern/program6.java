/*
        *
       ***
      *****
     *******
    *********
 */

import java.util.*;

class program6
{
    public static void Pattern(int No)
    {
        for(int i = 0; i < No; i++)
        {
            //Space
            for(int j = 0; j < No-i-1; j++)
            {
                System.out.print(" ");
            }
            // Star
            for(int j = 0; j < 2*i+1 ; j++)
            {
                System.out.print("*");
            }
            //Space
            for(int j = 0; j < No-i-1; j++)
            {
                System.out.print(" ");
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