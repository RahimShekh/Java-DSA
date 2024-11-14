class Vowel
{
    public static boolean main(char cNo)
    {
        if((cNo =='a') || (cNo =='e'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program1
{
    public static void main(String arg[])
    {
    
        char CValue ='a';
        boolean bRet = false;

        bRet = Vowel.main(CValue);

        if(bRet == true)
        {
            System.out.print("It is Vowel");
        }
        else
        {
            System.out.print("It is not a Vowel");
        }
    }
}