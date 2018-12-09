import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String d=br.readLine();
        String ad[]=d.split(" ");
        int da=Integer.parseInt(ad[0]);
        int k=Integer.parseInt(ad[1]);

String dat=br.readLine();
String ada[]=dat.split(" ");

                Stack<String> stackOfCards = new Stack<>();
for(int i=0;i<da;i++)
                stackOfCards.push(ada[i]);


                System.out.println("Stack => " + stackOfCards);
                System.out.println();

                // Popping items from the Stack
                String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
                System.out.println("Stack.pop() => " + cardAtTop);
                System.out.println("Current Stack => " + stackOfCards);
                System.out.println();

                // Get the item at the top of the stack without removing it


            }
        }







