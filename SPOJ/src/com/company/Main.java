package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int a[] = new int[1000];
        int d = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            d++;

            a[d] = Integer.parseInt(br.readLine());


        } while (a[d] < 42 || a[d] > 42);
        for (int d1 : a) {
            System.out.println(d1);
            if (d1 == 42) {
                break;
            }

        }

    }

    {
        System.out.print("Enter any sentence : ");
        String s = br.readLine();
        s = s + " ";
        int l = s.length();
        int c = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        System.out.println("Number of words = " + c);
    }
}