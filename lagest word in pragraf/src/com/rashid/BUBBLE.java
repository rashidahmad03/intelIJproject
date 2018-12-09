package com.rashid;/*
* algo
* for i to lenght[a]
* for j=0  to lenght[a]- i-1
* if a[j]>a[j+1]
* exchange a[]j,a[j-1]
*
*
* */


import java.util.ArrayList;

public class BUBBLE {
    static String a[];
    BUBBLE(String[] m)
    {
        a=m.clone();

        for (int i = 1; i <= a.length; i++) {
            for (int j = 0; j <= a.length - i - 1; j++) {
                if (ke(a[j]) > ke(a[j+1])) {
                    String t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;

                }

            }

        }

    }

public String [] tostr()
{
    return a;
}


    static int ke(String c)
    {
        String data[]=c.split(":");


        return Integer.parseInt(data[1]);
    }

}
