/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and 
column to 0's.

You must do it in place.
ex-   1   1    1                  1  0   1
      1   0    1         ans = >  0  0   0       
      1   1    1                  1  0   1

*/
import java.util.*;

class program41
{
    public static void setZeros(int Brr[][],int n,int m)
    {
        
        boolean row[] = new boolean[n];    // rows
        boolean col[] = new boolean[m];    // col

        // track the zeros
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(Brr[i][j] == 0)
                {
                    row[i] = true;
                    col[j] = true;      // this will mark row & col
                }
            }
        }

        // fill rows and cols with zeros
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(row[i] == true || col[j] == true)
                {
                    Brr[i][j] = 0;    // zero dalo
                }
            }
        }

        //display

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(Brr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Row:");
        int row = sobj.nextInt();

        System.out.println("Enter the size of col:");
        int col = sobj.nextInt();

        int arr[][] = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        setZeros(arr,row,col);
    }
}