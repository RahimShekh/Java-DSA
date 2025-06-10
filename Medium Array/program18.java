/*  // optimal force
Move all Zeros to the start of the array"

Example 1:
Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 0,0,0,1,2,3,4,1
Explanation:
All the zeros are moved to the end and non-negative integers are moved to front by maintaining 
order. */

import java.util.*;

class program18
{
    public static void MoveZeroRight(int Arr[], int n)
    {
       int i = 0; 
       int j = 0;

       while(i < n)
       {
            if(Arr[i] == 0)
            {
                int temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
                j++;
            }
            i++;
       }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int no = sobj.nextInt();

        int Brr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        MoveZeroRight(Brr,no);

        System.out.println("After Moving Zeros to right");

        for(int i = 0; i < no; i++)
        {
            System.out.print(Brr[i]+"\t");
        }
    }
}