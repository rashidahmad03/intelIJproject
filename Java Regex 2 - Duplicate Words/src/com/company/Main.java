package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  num = Integer.parseInt(br.readLine());
         String a[]=new String[num];
for (int i=0;i<num;i++)
{
    a[i]=br.readLine();
}
        for (int i=0;i<num;i++)
        {
            d(a[i]);
        }

    }

static void d(String a1)
{

String s[]=a1.split(" ");
    List<String> t= Arrays.asList(s);
    TreeSet<String> u=new TreeSet<String>(t);
System.out.println(u);
}

}
