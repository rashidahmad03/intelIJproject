package com.Maxdifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String c=br.readLine();
            String []s=c.split(" ");
            int da[] =new int[s.length];
            for(int i=0;i<s.length;i++) {
                da[i] = Integer.parseInt(s[i]);
              //  System.out.println(da[i]);
            }
            int dif[]=new int[da.length-1];
            for(int j=0;j<da.length;j++) {
               // System.out.println(da[j]);
                if (j<da.length-1) {
                    int aa = change(da[j], da[j + 1]);
                    dif[j]=aa;
                  //  System.out.println("diffrence "+aa);
                }
            }
            int v=max(dif);
            System.out.println(dif[v]);


	// write your code here
    }
    static int change(int x,int y) {

      //  System.out.println(x + "    " + y);
        if ( y > 0) {
            if (x > y)
                return x - y;
            else {
                return y - x;
            }


        }

        if (x < y)
            return x - y;
        else {
            return y - x;
        }

    }


    static int max(int[] z){
        int ma=0;
        int xc=z[0];
        for(int k=0;k<z.length;k++)
        {
            if(xc<Math.abs(z[k])) {
                xc = Math.abs(z[k]);
             //   System.out.print(xc+"  ****  ");
                ma=k;
            }
        }
        return ma;


    }

}
