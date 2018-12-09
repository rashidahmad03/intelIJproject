package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Biggcd {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger b1 = new BigInteger(br.readLine());
        BigInteger b, bi2;
        b = new BigInteger("11");
         bi2=b.gcd(b1);
        System.out.println(bi2);


    }
}