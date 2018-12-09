package com.Listdupplicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> ls=new ArrayList<Integer>();
        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
        String s=re.readLine();
        String ss[]=s.split(" ");

        for(int i=0;i<ss.length;i++)
            ls.add(Integer.parseInt(ss[i]));

            Duplicate(ls);


    }


    static void Duplicate(List<Integer> ar)
    {
        System.out.println(ar);
  Iterator s= ar.iterator();
System.out.println(s.hasNext());


    }


}
