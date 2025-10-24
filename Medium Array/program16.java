/* // brute force
Move all Zeros to the end of the array"

Example 1:
Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation:
All the zeros are moved to the end and non-negative integers are moved to front by maintaining 
order. */

import java.util.*;

class program16
{
    public static void MoveZeroRight(int Arr[], int n)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            if(Arr[i] != 0)
            {
                temp.add(Arr[i]);
            }
        }

        int Nz = temp.size();

        for(int i = 0; i < Nz; i++)
        {
            Arr[i] = temp.get(i);
        }

        for(int i = Nz; i < n; i++)
        {
            Arr[i] = 0;
        }

        System.out.println(temp);

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