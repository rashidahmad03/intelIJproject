package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

printDivisors(n);

        // write your code here
    }


    static void printDivisors(int n)
    {int x=0;
        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                x += (i * i);
                System.out.println(i);
            }
            }
        System.out.println(x);
    }
}
