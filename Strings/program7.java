//logically reverse
import java.util.*;

class program7
{
    public static void Reverse(String Str)
    {
        String StrRev ="";

        for(int i = Str.length()-1; i >= 0; i--)
        {
            char ch = Str.charAt(i);

            StrRev = StrRev + ch;
        }

        System.out.println(StrRev);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        Reverse(str);
    }
}