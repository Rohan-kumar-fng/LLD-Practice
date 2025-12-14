import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class ElevatorController{
    // thinking of storing the active pool of elevators
    // firsly it need to receive the request
    // Apply algorithm in the service layer to allocate the aelevator
    // Active elevator pool (unordered_set to get that this elevator is present in the pool or not)
    // Need to add the Request i the REquest Queue (HashLinked List????) No
    // Options:- LinkedList<>, ArrayDeque<>, PriorityQueue<>, Thread Safe Queue (ConcurrentLinkedQueue, LinkedBlockingQueue, ArrayBlockingQueue)

    HashSet <Elevator> activeElevator =  new HashSet<>();
    ArrayDeque <Request> requestQueue = new ArrayDeque<>();

    ElevatorController(ArrayList <Elevator> e){
        for(Elevator elevator: e){
            this.activeElevator.add(elevator);
        }
    }

    // One method for processREquest
    public Boolean processRequest(Request request){
        //I think here most of the logic goes to the service class
        System.err.println("Inside Processing Request");
        try {
            requestQueue.add(request);
            Elevator allocatedElevator = new Elevator(100,6);
            System.out.println("Allocated Elevator: " + allocatedElevator.getCurrentFloor());
            try {
                allocatedElevator = ElevatorService.handleRequest(requestQueue,activeElevator);
                System.out.println("Allocated Elevator: " + allocatedElevator.getCurrentFloor());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Elevator got: " + allocatedElevator.getId());
            activeElevator.remove(allocatedElevator);
            return ElevatorService.processAllocation(allocatedElevator, request);
        } catch (Exception e){
            System.out.println("Unavle to process Request");
        }
        System.out.println("Able to processRequest");
        return true;
    }


}