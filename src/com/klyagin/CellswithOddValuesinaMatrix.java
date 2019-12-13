package com.klyagin;

public class CellswithOddValuesinaMatrix {
    //Task URL: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

    public static int oddCells(int n, int m, int[][] indices) {
        int mat[][] = new int[n][m];
        int ri,ci;
        for(int i = 0; i < indices.length; i++){
            ri = indices[i][0];
            ci = indices[i][1];
            add(ri,ci,mat);
        }
        int count = 0;
        for(int i = 0; i < mat.length; i++)
            for(int j = 0; j < mat[0].length; j++)
                if(mat[i][j] % 2 == 1)
                    count++;
        return count;
    }
    public static void add(int ri, int ci, int[][] mat)
    {
        if(ri >= mat.length || ci >= mat[0].length)
            System.exit(0);
        for(int i = 0; i < mat.length; i++)
            mat[i][ci]++;
        for(int j = 0; j < mat[0].length; j++)
            mat[ri][j]++;
    }

    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0,1}, {1,1}}));
        System.out.println(oddCells(2, 2, new int[][]{{1,1}, {0,0}}));
        /** Result:
         Runtime: 1 ms, faster than 90.61% of Java online submissions for Cells with Odd Values in a Matrix.
         Memory Usage: 40.7 MB, less than 100.00% of Java online submissions for Cells with Odd Values in a Matrix.
         */
    }
}
