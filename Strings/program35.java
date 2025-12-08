/*
split method to store string in array

Ex-  Rahim shekh babu
it will store like this                 0    1     2
str.split(" ");                       Rahim Shekh Babu
Ex-
str.split("");  // no space  0 1 2 3 4 5 6 7 8 9 10
                             r a h i m   S h e k h
*/

import java.util.*;

class program35
{
    public static void Logic(String Str)
    {
        String arr[] = Str.split(" ");
        // String arr[] = Str.split("");
        for(String it: arr)
        {
            System.out.print(it);
        }

        System.out.println("Length:"+arr[0].length());

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the 1st String:");
        String str1 = sobj.nextLine();
        

        Logic(str1);
    }
}