package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class st {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 0;
        do {
            flag = 0;
            for (int i = 0; i < s.length(); i++) {
                int count = 0;
                for (int j = 0; j < s.length() - i; j++) {
                    if (s.charAt(i) == s.charAt(i + j)) {
                        count++;
                    } else {
                        if ((count % 2 == 0) && (count != 0)) {
                            s = s.replaceFirst(s.substring(i, i + count), "");
                            flag = 1;
                        }
                        break;
                    }
                }
            }
        } while (flag != 0);


        System.out.println(s);
    }
}



