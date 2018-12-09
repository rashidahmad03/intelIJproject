/*
*
*Monk and Welcome Problem
Attempted by: 23975/Accuracy: 82%/Maximum Score: 10/
 542 Votes
Tag(s): Data Structures, Very-Easy
PROBLEM
EDITORIAL
MY SUBMISSIONS
ANALYTICS
Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C such that:
 ;
Now, Monk will proceed further when you solve this one. So, go on and solve it :)

Input:
First line consists of an integer N, denoting the size of A and B.
Next line consists of N space separated integers denoting the array A.
Next line consists of N space separated integers denoting the array B.

Output:
Print N space separated integers denoting the array C.

Input Constraints:

;
;

SAMPLE INPUT
5
1 2 3 4 5
4 5 3 2 10
SAMPLE OUTPUT
5 7 6 6 15
* */


package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

    public static void main(String[] args) throws IOException {

         Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
           scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;

            }

        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.println(arr[i][j]);

            }

        }






    }


}