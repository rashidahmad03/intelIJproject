package com.company;

public class test {


    static int diagonalDifference(int[][] arr) {
        int d1 = 0, d2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n-1) {
                    d1 += arr[i][j];
                }
                if (i == j) {
                    d2 += arr[i][j];

                }
            }
        }    return d1-d2;

    }

    public static void main(String[] args) {
       // int arr[][]=new  int[][]{{6,6, 7,-10 9 -3 8 9 -1},{9 7 -10 6 4 1 6 1 1},{-1 -2 4 -6 1 -4 -6 3 9},{-8 7 6 -1 -6 -6 6 -7 2},{-10 -4 9 1 -7 8 -5 3 -5},{-8 -3 -4 2 -3 7 -5 1 -5},{-2 -7 -4 8 3 -1 8 2 3},{-3 4 6 -7 -7 -8 -3 9 -6},{-2 0 5 4 4 4 -3 3 0}};
       // System.out.println(diagonalDifference(arr));
    }
}
