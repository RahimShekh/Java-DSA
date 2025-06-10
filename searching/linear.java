import java.util.*;

class linear
{
    public static void LinearSearch(int Brr[],int iNo)
    {
        for(int i=0; i< Brr.length; i++)
        {
            if(Brr[i] == iNo)
            {
                System.out.println("Element is present");
                return;
            }
        }
        System.out.println("Element is Not Present");
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the Element For Search:");
        int iSearch = sobj.nextInt();

        LinearSearch(Arr,iSearch);
    }
}