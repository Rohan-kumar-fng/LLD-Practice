
import java.time.LocalDateTime;
import java.util.Arrays;

public class EntryGate{
    // It must have request for entry
    // Its better to setup entry Time here
    // create Ticket
    // mark the slot vacant
    private final LocalDateTime entryTime;
    public EntryGate(LocalDateTime entryTime){
        // this.entryTime = new Timestamp(System.currentTimeMillis()).toLocalDateTime();
        this.entryTime = entryTime;
    }
    public Boolean validateVehicle(Vehicle vehicle){
        return Arrays.asList(VehicleType.values()).contains(vehicle.getType());
    }
    public Ticket requestEntry(Vehicle vehicle){
        if(!validateVehicle(vehicle)){
            System.out.println("Not able to Validate Vehivle to Enter");
        }
        Ticket ticket = new Ticket(vehicle.getId(), this.entryTime);
        return ticket;
    }
        
}