package com.rashid;
public class Main {
    public static void main(String[] args) {
final int c=5;
        for(int i=0;i<c;i++)
        {
            for (int j=c-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i-1;j++)
            {
                System.out.print("*");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}
}
