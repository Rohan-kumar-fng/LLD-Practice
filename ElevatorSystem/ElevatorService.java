import java.util.ArrayDeque;
import java.util.HashSet;

public class ElevatorService{
    // this just contain the buisness logic
    public static Elevator handleRequest(ArrayDeque <Request> requestQueue, HashSet <Elevator> activeElevator){
        Elevator allocatedElevator = new Elevator(101,6);
        try {
            int minDis = Integer.MAX_VALUE;
            Request currentRequest = requestQueue.peek(); // Check weither you can use front or back here
            for(Elevator elevator: activeElevator){
                if(minDis > Math.abs(elevator.getCurrentFloor()-currentRequest.getSourceFloor())){
                    minDis = Math.abs(elevator.getCurrentFloor()-currentRequest.getSourceFloor());
                    allocatedElevator = elevator;
                }
            }
             // give the nearest elevator from the sourceElevator
        } catch(Exception e){
            System.
            out.println("Not Able to Handle Request from REquest Queue");
        }
        return allocatedElevator;
    }
    public static Boolean processAllocation(Elevator elevator, Request request){
        elevator.setCurrentFloor(request.getSourceFloor());
        elevator.setStatus("IN_PROGRESS");
        return true;
        // remove this elevator from available Elevator List
    }
}