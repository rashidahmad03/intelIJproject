package com.company;

public class Main {

    public static void main(String[] args) {
            String v="645 2 3 4 4 5 5 6";
            String a[]=v.split(" ");
        int d=0;
        System.out.println(v.codePointAt(0));
            for (String s : a)
           d*=Integer.parseInt(s);

    System.out.println(d);
    }
    }

