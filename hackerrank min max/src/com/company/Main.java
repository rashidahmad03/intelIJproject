package com.company;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a=Integer.parseInt(br.readLine());
        int s= (int) Math.sqrt(a);
        if((s*s)-a==0)
            System.out.println("perfact");
        else
            System.out.println("Not perfact");



//        Vector v = new Vector();
//
//
//        v.add(1);
//        v.add(2);
//        v.add(5);
//        v.add(5);
//        v.add(3);
//        int d=0;
//        for(int i=0;i<v.size();i++)
//        {
//            d+=Integer.parseInt(String.valueOf(v.elementAt(i)));
//        }
//
//System.out.println(d);
//        System.out.println(v.size());
//        // write your code here
    }
}

