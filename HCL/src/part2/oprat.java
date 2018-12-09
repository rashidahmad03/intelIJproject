package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class oprat {
    static int f=0;
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> ns=new Stack();

ns.push(' ');

       String dd= br.readLine();
String f="";
        for(int i=0;i<dd.length();i++) {

                if (dd.charAt(i) ==( ns.pop())) {
                    //ns.pop();
                } else {
                    ns.push(dd.charAt(i));
                }

        }
        System.out.println(ns);
    }


}
