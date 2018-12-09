package com.rashid;
import java.io.*;
import java.util.*;
public class ROBORT {
  public static HashMap h = new HashMap();
   static String fh[]=null;
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("word_freq_input1.txt");
        int kj = 0;
        String jh = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        DataInputStream ds = new DataInputStream(fs);
        while ((kj = br.read()) != -1) {
            if ((char) kj == ' '||(char) kj == '.'||(char) kj == ','||(char) kj == '(') {
                data(jh);
                jh = "";
            } else {
                jh = jh + String.valueOf((char) kj);
            }
        }

        System.gc();


        fh= new String[h.size()];
        int n = 0;
        for (Object f:h.keySet()) {
            fh[n++] = String.valueOf(f + ":" + h.get(f));

        }

     //   System.out.println(h.size());
        new ROBORT().sor(5);
    }
    public void  sor(int count){
        ArrayList<String> up=new ArrayList<>();
        ArrayList<String> low=new ArrayList<>();
        BUBBLE bs=new BUBBLE(fh);
for(int i=fh.length-1;i>=fh.length-count;i--)
up.add(String.valueOf(bs.tostr()[i]));


System.out.println(up);
for(int i=0;i<count;i++)
          low.add(bs.tostr()[i]);

System.out.println(low);
}
 static void data(String j){

        if  (h.containsKey(j))
        {
            int s= (int) h.get(j);
            s++;

            h.put(j, s);
        }
        else{
            h.put(j,1);
        }

    }
}
