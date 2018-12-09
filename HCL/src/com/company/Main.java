package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here

String a="gu";
        Optional<String> b=Optional.empty();
        try{
            System.out.println(a.length());
            System.out.println(b.orElse("").length());

        }
        catch (Exception e)
        {
            System.out.println(a);
        }
        finally {
            a="String";
//   b.Optional.ofNullable();
   System.out.println(b.get().length());

        }


    }
}
