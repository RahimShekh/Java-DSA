//write a program to reverse a string

import java.util.*;

class program31
{
    public static void Reverse(String Str)
    {
        char Arr[] = Str.toCharArray();

        int End = Arr.length-1;

        for(int i = 0; i < Arr.length/2; i++,End--)
        {
            char temp = Arr[i];
            Arr[i] = Arr[End];
            Arr[End] = temp;
        }

        for(int i = 0; i< Arr.length;i++)
        {
            System.out.print(Arr[i]);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = sobj.nextLine();

        Reverse(str);
    }
}