

import java.util.*;


class TestClass {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {

        String[] DAT = scanner.nextLine().split(" ");

        int dar1=Integer.parseInt(DAT[0]);
        int dar2=Integer.parseInt(DAT[1]);
        int[] ar = new int[dar1];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arItems.length; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }


        Arrays.sort(ar);

        for(int s:ar)
            System.out.println(s);



    }


}

