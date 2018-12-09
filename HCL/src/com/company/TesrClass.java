package com.company;




import java.util.*;


class TestClass {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {

        String[] DAT = scanner.nextLine().split(" ");

        int dar1=Integer.parseInt(DAT[0]);
        int dar2=Integer.parseInt(DAT[1]);
        int[] ar = new int[dar1];
        Stack<Integer> input = new Stack<Integer>();
        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arItems.length; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            input.add( arItem);
        }
        Stack<Integer> tmpStack=sortstack(input);


int sum=0;
            for(int i=0;i<ar.length-dar2;i++)
            {
                sum+=tmpStack.pop();
            }
        System.out.println(sum);

    }
    public static Stack<Integer> sortstack(Stack<Integer>
                                                   input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }


}

