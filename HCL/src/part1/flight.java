package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class flight {



    final int MAX = 20;
    int numFlights = 0;
    Stack btStack = new Stack();
    FlightInfo flights[] = new FlightInfo[MAX];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sd=br.readLine();
        String as[]=sd.split(" ");
        flight f=new flight();
        String from=as[0];
        String to=as[1];
       try {
           for (int n = 0; n <3; n++) {
               String da = br.readLine();
               String caa[] = da.split(" ");
               f.addFlight(caa[0], caa[1], Integer.parseInt(caa[2]));

           }

           f.isflight(from, to);
          f.isflight(from, to);


           if (f.btStack.size() != 0)
               f.route(to);
       }
       catch (Exception d)
       {

       }

    }
     void addFlight(String from, String to, int dist) {
        if (numFlights < MAX) {
            flights[numFlights] = new FlightInfo(from, to, dist);

            numFlights++;
        } else
            System.out.println("Flight database full.\n");
    }
    void route(String to) {
        Stack rev = new Stack();
        int dist = 0;
        FlightInfo f;
        int num = btStack.size();

        // Reverse the stack to display route.
        for (int i = 0; i < num; i++)
            rev.push(btStack.pop());

        for (int i = 0; i < num; i++) {
            f = (FlightInfo) rev.pop();
            System.out.print(f.from+" ");
            dist += f.distance;
        }

        System.out.print(to+" "+dist+"\n");

       // System.out.println("Distance is " + dist);
    }

    /*
     * If there is a flight between from and to, return the distance of flight;
     * otherwise, return 0.
     */
    int match(String from, String to) {
        for (int i = numFlights - 1; i > -1; i--) {
            if (flights[i].from.equals(from) && flights[i].to.equals(to)
                    && !flights[i].skip) {
                flights[i].skip = true; // prevent reuse
                return flights[i].distance;
            }
        }

        return 0; // not found
    }

    // Given from, find any connection.
    FlightInfo find(String from) {
        for (int i = 0; i < numFlights; i++) {
            if (flights[i].from.equals(from) && !flights[i].skip) {
                FlightInfo f = new FlightInfo(flights[i].from, flights[i].to,
                        flights[i].distance);
                flights[i].skip = true; // prevent reuse

                return f;
            }
        }

        return null;
    }

    // Determine if there is a route between from and to.
    void isflight(String from, String to) {
        int dist;
        FlightInfo f;

        // See if at destination.
        dist = match(from, to);
        if (dist != 0) {
            btStack.push(new FlightInfo(from, to, dist));
            return;
        }

        // Try another connection.
        f = find(from);
        if (f != null) {
            btStack.push(new FlightInfo(from, to, f.distance));
            isflight(f.to, to);
        } else if (btStack.size() > 0) {
            // Backtrack and try another connection.
            f = (FlightInfo) btStack.pop();
            isflight(f.from, f.to);
        }


    }

}
class FlightInfo {
    String from;

    String to;

    int distance;

    boolean skip; // used in backtracking

    FlightInfo(String f, String t, int d) {
        from = f;
        to = t;
        distance = d;
        skip = false;
    }
}
