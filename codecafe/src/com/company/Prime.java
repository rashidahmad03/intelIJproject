package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cc = Integer.parseInt(br.readLine());
//System.out.println(cc);

        int i = 0;
        int num = 0;
        String c = "";
        for (i = 1; i < cc; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                c = c + i + " ";
            }
        }
        System.out.println(c);
    }

}