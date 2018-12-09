package part2;

import java.util.ArrayList;
import java.util.List;

public class test4 {
    public static void main(String[] args) {
        List l1 = new ArrayList();

        l1.add(5);
        l1.add(2);
        l1.add(9);
        int last=l1.size();

        System.out.println(l1.size());
       Object f= l1.get(1);

       // l1.add(1,f);
//        Object l= l1.get(last-1);
//        l1.remove(last-1);
//        l1.add(l);

        for(Object bg:l1)
            System.out.print(bg);

    }
}
