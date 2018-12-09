package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
     ca fm=new ca();
  int c=  fm.cal(fm.cal(fm.cal(23,-32),23),8);
System.out.println(c);
int i=0;
int j=--i;
System.out.println(i+++--i+i--+j--+--i+i);
    }
}
class ca{
    public int cal(int a,int b){
        return (a>b?a:b);
    }
}