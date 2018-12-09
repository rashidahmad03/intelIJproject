package new1;

import java.util.LinkedList;
import java.util.List;

public class Deepcomput3 {
    public static void main(String[] args) {

        List  ls=new LinkedList();//linked ist is easy for doing such things
        ls.add(5);
        ls.add(325);
        ls.add(25);
        ls.add(33);
        ls.add(88);


        //if the size is list 1 the not oprate
        if(ls.size()>1) {
            Object first = ((LinkedList) ls).getFirst();
            Object last = ((LinkedList) ls).getLast();
            ((LinkedList) ls).pollFirst();
            ((LinkedList) ls).pollLast();
            ((LinkedList) ls).addFirst(last);
            ((LinkedList) ls).addLast(first);
        }
        System.out.println(ls);
    }
}
