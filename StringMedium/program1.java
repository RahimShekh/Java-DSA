/*  Maximum Nesting Depth of the Parentheses
Given a valid parentheses string s, return the nesting depth of s. The nesting depth 
is the maximum number of nested parentheses.
Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.
Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3
Explanation:
Digit 3 is inside of 3 nested parentheses in the string.
Example 3:
Input: s = "()(())((()()))"
Output: 3
*/

import java.util.*;

class program1
{
    public static void Logic(String Str)
    {
        char arr[] = Str.toCharArray();
        int iCnt = 0;
        int maxCount = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == '(')
            {
                iCnt++;
            }
            else if(arr[i] == ')')
            {
                maxCount = Math.max(maxCount,iCnt);
                iCnt--;
            }
        }

        System.out.println("the max count of parenthesis:"+maxCount);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        Logic(str);
    }
}