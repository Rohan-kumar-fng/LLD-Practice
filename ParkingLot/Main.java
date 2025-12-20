
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // This method just create everything, like vehicles, controller
        // LAter call controller for everything
        // Output the Result of allocation
        Vehicle vehicle1 = new Vehicle(VehicleType.CAR);
        Vehicle vehicle2 = new Vehicle(VehicleType.BIKE);
        Vehicle vehicle3 = new Vehicle(VehicleType.BUS);
        Vehicle vehicle4 = new Vehicle(VehicleType.CYCLE);
        Vehicle vehicle5 = new Vehicle(VehicleType.TRUCK);

        ParkingSlot parkingSlot = new ParkingSlot(2,2);
        EntryGate entryGate = new EntryGate(LocalDateTime.now());
        ParkingLotController parkingLotController = new ParkingLotController(parkingSlot);
        if(parkingLotController.allocateSlot(vehicle1)){
            System.out.println("Able to allocate Vehicle to parking: " + vehicle1.getType().toString() + " : " + vehicle1.getId());
        } else {
            System.out.println("Unable to allocate Vehicle to parking: " + vehicle1.getType().toString() + " : " + vehicle1.getId());
        }

        Ticket ticket = entryGate.requestEntry(vehicle1);

        ExitGate exitGate = new ExitGate(LocalDateTime.now().plusHours(2));
        if(exitGate.validateTicket(ticket)){
            System.out.println("Able to validate Ticket");
            exitGate.calculatePayment(ticket);
        } else {
            System.out.println("Unable to validate Ticket");
        }

    }
}
