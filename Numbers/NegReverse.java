/*  Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes 
the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Ex - Input: x = 123
     Output: 321
Ex - Input: x = -123
     Output: -321
*/

import java.util.*;

class NegReverse
{
     public static void Logic(int num)
     {
          int reverse = 0;
          while(num != 0)   // num > 0 will not work if number will be -ve
          {
               int idigit = num % 10;
               reverse = (reverse * 10) + idigit;
               num = num / 10;
          }

          System.out.println("the reverse:"+reverse);
     }
     public static void main(String arg[])
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter the Number:");
          int val = sobj.nextInt();

          Logic(val);
     }
}

//   // to handle overflow condition 32 bit int
//             if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10)
//             {
//                 return 0;
//             }
// only use for specific condition like leetcode