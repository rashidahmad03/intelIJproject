package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
char c;
int siz[]=chnage(s,1);

        char cfd[][]=new char[siz[0]][siz[1]];
        String ss[]=new String[siz[0]];
        for (int i=0;i<siz[0];i++)
        {
            ss[i]=br.readLine();
            for (int j=0;j<siz[1];j++)
            {

                cfd[i][j]=ss[i].charAt(j);
                if(cfd[i][j]!='0' || cfd[i][j]!='1'){

                }
            }
        }
        int k;
        int max=0;
        int x[]=new int[siz[0]];
        for (int i=0;i<siz[0];i++)
        {
            k=siz[1]-1;
            for (int j=0;j<siz[1];j++)
            {
               x[i]=x[i]+(int)Math.pow(2,k)*Character.getNumericValue(cfd[i][j]);
               k--;
            }
            if(x[i]>max)
            {
                max=x[i];
            }
        }

        for(int i=0;i<siz[0];i++)
            if(x[i]==max) {
                System.out.println(i + 1);
                break;
            }

    }
    public static int[] chnage(String d,int n)
    {
        int bb[] = new int[n];
        StringTokenizer sr=new StringTokenizer(d,"  ");
        int m=0;
        while (sr.hasMoreTokens()){
            bb[m]=Integer.parseInt(sr.nextToken());
            m++;
        }
        return bb;
    }
}
