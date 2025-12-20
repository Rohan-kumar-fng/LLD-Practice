

import java.util.ArrayList;

public class Main{
    // Here I need to mention to create n Elevator and m Floor
    // Then give the command to Elevator Controller to work on (Mayeb some method present inside the Controller that do the execution done by the SErvice class)
    // No Need to create m Floor Array
    // Maybe you need to create n elevator Class in form of some HashMap
    //
    public static void main(String[] args) {
        ArrayList <Elevator> e = new ArrayList<>();
        Elevator elevator1 = new Elevator(0,1);
        Elevator elevator2 = new Elevator(0,2);
        Elevator elevator3 = new Elevator(0,3);
        Elevator elevator4 = new Elevator(0,4);
        Elevator elevator5 = new Elevator(0,5);
        e.add(elevator1);
        e.add(elevator2);
        e.add(elevator3);
        e.add(elevator4);
        e.add(elevator5);

        // All elevator are rested in the ground floor
        Request request1= new Request(1,6);
        Request request2 = new Request(2,1);
        Request request3 = new Request(4,0);
        
        ElevatorController elevatorController = new ElevatorController(e);

        elevatorController.processRequest(request1);
        elevatorController.processRequest(request2);
        elevatorController.processRequest(request3);
    }

}