/* Count the exact words and Remove all white spaces

Ex -
input : rahim shek babu
output : 3

Ex-
input : r  a  h     i  m
output: 5

//u can use split method to skip looping to count words
*/

import java.util.*;

class program12
{
    public static void Logic(String Str)
    {
        int iCnt = 0;
         Str  = Str.trim();
        Str = Str.replaceAll("\\s+"," ");

        for(int i=0; i<Str.length(); i++)
        {
            char ch = Str.charAt(i);

            if(ch == ' ')
            {
                iCnt++;
            }
        }

        System.out.println("The count of words:"+(iCnt+1));
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the 1st String:");
        String str1 = sobj.nextLine();
        

        Logic(str1);
    }
}