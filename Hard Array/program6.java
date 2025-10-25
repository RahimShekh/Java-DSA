/*  Rearrange array elements by sign
Example 1:
Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5
Explanation: 
Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
Example 2:
Input:
arr[] = {1,2,3,-1,-2,-3}, N = 6
Output:
1 -1 2 -2 3 -3
// imp note elements should be equal 3 pos 3 neg then it will work
*/
import java.util.*;

class program6
{
    public static void Logic(int Brr[],int n)
    {
       ArrayList<Integer> pos = new ArrayList<>();
       ArrayList<Integer> neg = new ArrayList<>();

       for(int i=0; i<n; i++)
       {
            if(Brr[i] < 0)
            {
                neg.add(Brr[i]);
            }
            else{
                pos.add(Brr[i]);
            }
       }
       for(int i=0; i<n/2; i++)
       {
            Brr[2*i] = pos.get(i);
            Brr[2*i+1] = neg.get(i);
       }

       for(int it: Brr)
       {
         System.out.print(it+" ");
       }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Logic(arr,size);
    }
}