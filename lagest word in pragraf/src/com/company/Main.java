//package com.company;
//
//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//     //   File  f=new File("word_freq_input1.txt") ;
//        //FileReader fr=new FileReader(f);
//   //     BufferedReader br=new BufferedReader(fr);
//        FileInputStream fs=new FileInputStream("word_freq_input1.txt");
//        DataInputStream ds=new DataInputStream(fs);
//
//
//while(da!=null) {
//
//    da = ds.readLine();
//    String[] s = da.split(" ");
//    String bigs = big(s);
//    System.out.println(bigs);
//    int count = 0;
//    for (int j = 0; j < s.length; j++) {
//        if (s[j].equalsIgnoreCase(bigs))
//            count++;
//    }
//
//
//    System.out.println(count);
//    for (String v : s)
//        System.out.print(v);
//}
//fs.close();
//ds.close();
//}
//static String big(String l[]){
//        String c=l[0];
//      for(int i=0;i<l.length;i++)
//      {
//          if(c.length()<l[i].length())
//          c=l[i];
//      }
//        return c;
//    }
//}
