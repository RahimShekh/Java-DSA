import java.util.*;

class program33
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = sobj.nextLine();

        String str1 = str.replaceAll("a","z");

        System.out.println(str);
        System.out.println(str1);
    }
}