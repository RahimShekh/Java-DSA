/*   Find the number that appears once, and the other numbers twice
Example 1:
Input Format: arr[] = {2,2,1}   Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}    Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. 
So, 4 is the answer.
// XOR                                       */
import java.util.*;

class program27
{
    public static void AppearOnce(int Brr[],int n)
    {
       int Xor = 0;

       for(int i = 0; i < n; i++)
       {
            Xor = Xor ^ Brr[i];
       } 

       System.out.println("The Element appear oncce:"+Xor);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        AppearOnce(Arr,size);

       
    }
}