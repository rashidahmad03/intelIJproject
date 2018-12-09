package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());


        for (int i = 0; i < c; i++) {
            int ar = Integer.parseInt(br.readLine());


            String dat[] = new String[ar];
            for (int j = 0; j < ar; j++) {
                dat[j] = br.readLine();
            }
            display(dat);
        }


    }

    static void display(String[] dat) {
        int f[]=new int[dat.length];
        for (int i = 0; i < dat.length; i++) {
            String data[] = dat[i].split(" ");
            f[i]=add(data);
        }
        int s=0;
        for (int j=0;j<f.length;j++)
            s+=f[j];
            System.out.println(s);

    }

    static int add(String[] at) {
        int d=1;

        for(int i=0;i<at.length;i++) {
            d = d * Integer.parseInt(at[i]);

        }
        return d;

    }


}
