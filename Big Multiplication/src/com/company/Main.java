package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  num = Integer.parseInt(br.readLine());
        String d[]=new String[num];
        BigInteger b1[]=new BigInteger[num];
        BigInteger b2[]=new BigInteger[num];
        BigInteger x[]=new BigInteger[num];

        for(int i=0;i<num;i++)
        {
            d[i]=br.readLine();
        }

        for(int i=0;i<num;i++)
        {
            b1[i]= BigInteger.valueOf(Long.parseLong(d[i].substring(0,d[i].indexOf(' '))));
            b2[i]=BigInteger.valueOf(Long.parseLong(d[i].substring(d[i].indexOf(' ')+2,d[i].length()-1)));
            x[i]=b1[i].multiply(b2[i]).mod(new BigInteger("3"));
        }

        for(int i=0;i<num;i++)
            System.out.println(x[i]);


        // write your code here
    }
}
