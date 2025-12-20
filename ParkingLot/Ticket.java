
import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    // ticket contain id, entryTime, vehicleName, allocatedSlot
    private UUID id;
    private LocalDateTime entryTime;
    private Long vehicleId;
    public Ticket(Long vehicleId, LocalDateTime entryTime){
        this.vehicleId = vehicleId;
        UUID uuid = UUID.randomUUID();
        this.id = uuid;
        this.entryTime = entryTime;
    }
    public UUID getId(){
        return this.id;
    }
    public LocalDateTime getEntryTime(){
        return this.entryTime;
    }
    public Long getVehicleId(){
        return this.vehicleId;
    }
    public void setVehicleId(Long vehicleId){
        this.vehicleId = vehicleId;
    }
    public void setEntryTime(LocalDateTime entryTime){
        this.entryTime = entryTime;
    }
    public void setId(UUID id){
        this.id = id;
    }
    
}
