import java.util.*;

class program27
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println("The char:"+Arr[1]);
    }
}