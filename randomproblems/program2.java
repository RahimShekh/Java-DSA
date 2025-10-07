import java.util.*;

class program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        for(int i = 1; i <str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
            {
                bRet = true;
                break;
            }
        }

        if(bRet == true)
        {
            System.out.print("It is a vowel");
        }
        else
        {
            System.out.print("It is not a vowel");
        }

    }
}