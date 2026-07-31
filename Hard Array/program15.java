/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees 
(clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix
directly. DO NOT allocate another 2D matrix and do the rotation. 
Ex- 
input :                        Output:
       1  2  3                    7  4  1
       4  5  6                    8  5  2
       7  8  9                    9  6  3
*/
//in this soluton we allocating another 2D matrix
//Tc = O(n2)    Sc = O(n2)

import java.util.*;

class program15
{
    public static void Matrix(int brr[][],int n,int m)
    {
        int ans[][] = new int[n][m];

        //just add the values in ans matrix
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                ans[j][(n-1)-i] = brr[i][j];   // 4-1-0 = 3
            }
        }
        
        //display
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the rows:");
        int row = sobj.nextInt();

        System.out.println("Enter the col:");
        int col = sobj.nextInt();

        int arr[][] = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        Matrix(arr,row,col);
    }
}