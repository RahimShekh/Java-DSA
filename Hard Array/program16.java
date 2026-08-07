/*  Pascal Traingle  
Type 1 => given a row and col print the element or return element at that place
             1
          1    1
       1     2     1
     1    3     3      1
  1     4    6      4      1

    Ex - Row = 4 , col = 2
        output =>   3
*/

import java.util.*;

class program16
{                              
    public static void Logic(int row,int col)   //(4,2)
    {
        int n = row - 1;   //3
        int r = col - 1;   //1

        int ans = 1;    // should be 1

        for(int i=0; i<r; i++)
        {
            ans = ans * (n-i);     // 1 * 3-0 = 3
            ans = ans / (i+1);     // 3 /0+1  = 3/1 == 3 is the ans
        }

        System.out.println("The Pascal Traingle value:"+ans);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Row:");
        int r = sobj.nextInt();

        System.out.println("Enter the column:");
        int c = sobj.nextInt();

        Logic(r,c);   // we need do -1 its formula of nCr
    }
}