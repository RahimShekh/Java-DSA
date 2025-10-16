/*
Q. Find the unique element form the given array.
    arr[] = { 5 , 3, 2, 2, 3};
    o/p = 5

    `Explaiantion : 
    3 => 2
    2 => 2
    5 => 1
*/

import java.util.*;

class program1
{
    public static void Logic(int Brr[],int n)
    {
        int unique = 0;

        for(int i=0; i<n; i++)
        {   
            int iCnt =0;
            for(int j=0; j<n; j++)
            {
                if(Brr[i] == Brr[j])
                {
                    iCnt++;
                }
            }
            if(iCnt == 1)
            {
                unique = Brr[i];    
            }
        }

        System.out.println("The unique element:"+unique);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the No:");
        for(int i= 0; i<iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,iSize);
    }
}