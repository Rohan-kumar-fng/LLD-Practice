
public class ParkingLotController{
    // This class will orchestract the whole parking and unparking flow
    // This calls various classes with there responsibilities.
    // Maybe call Service layer, Lets keep as is it.
    private final ParkingSlot parkingSlot;
    public ParkingLotController(ParkingSlot parkingSlot){
        this.parkingSlot = parkingSlot;
    }
    public Boolean allocateSlot(Vehicle vehicle){

        for(int floor=0;floor<=this.parkingSlot.getFloor();floor++){
            for(int slot=0;slot<=this.parkingSlot.getSlot();slot++){
                if(parkingSlot.isAvailable(floor, slot)){
                    parkingSlot.setAvailable(floor, slot, false); // Book it
                    return true;
                }
            }
        }
        return false;
    }
    public Boolean unallocateSlot(Integer floor, Integer slot){
        this.parkingSlot.setAvailable(floor, slot, true);
        return true;
    
    }
        
}