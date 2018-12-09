package new1;


import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Deepcomput2 {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("hello.txt");
        Scanner sc=new Scanner(fr);
        HashMap<String,Integer> hs=new HashMap<String, Integer>();//sorry of collection use there is no rule to make own logic
    while(sc.hasNextLine())
        {
            String ky=sc.next();
           if(hs.containsKey(ky))
           {
               hs.put(ky,hs.get(ky)+1);
           }
           else
           {
               hs.put(ky,1);
           }
        }
        System.out.print(hs);
    }
}
