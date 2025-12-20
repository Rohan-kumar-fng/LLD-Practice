
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingSlot {
    // this have much responsibility
    // Able to generate ticket
    // able to allocate vacant slots
    private final Integer floor;
    private final Integer slot;
    private final Boolean[][] available;
    private List<VehicleType> vehicleAllowed;
    public ParkingSlot(Integer floor, Integer slot){
        this.floor = floor;
        this.slot = slot;
        this.available = new Boolean[floor][slot];
        for(int i=0;i<floor;i++){
            for(int j=0;j<slot;j++){
                this.available[i][j] = true;
            }
        }
        this.vehicleAllowed = new ArrayList<>();
        this.vehicleAllowed.addAll(Arrays.asList(VehicleType.values()));
    }
    public Integer getFloor(){
        return this.floor;
    }
    public Integer getSlot(){
        return this.slot;
    }
    public Boolean isAvailable(Integer floor, Integer slot){
        return this.available[floor][slot];
    }
    public void setAvailable(Integer floor, Integer slot,Boolean available){
        this.available[floor][slot] = available;
    }
    public List<VehicleType> getVehicleAllowed(){
        return this.vehicleAllowed;
    }
    public void setVehicleAllowed(List<VehicleType> vehicleAllowed){
        this.vehicleAllowed = vehicleAllowed;
    }
}
