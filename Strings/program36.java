/*
count the length of largest word in a given String

Ex: 
input :  rahim shek
output : 5
*/

import java.util.*;

class program36
{
    public static void Logic(String Str)
    {
        Str = Str.trim();
        Str = Str.replaceAll("\\s+"," ");
        String arr[] = Str.split(" ");

        int iMax = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].length() > iMax)
            {
                iMax = arr[i].length();
            }
        }
        System.out.println("The largest word in String:"+iMax);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the 1st String:");
        String str1 = sobj.nextLine();
        

        Logic(str1);
    }
}