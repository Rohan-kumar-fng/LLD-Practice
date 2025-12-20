import java.util.Random;

public class Vehicle {
    private Long id;
    private VehicleType type; // small, medium, big

    // Vehicle does not know about its own entry exit time.
    public Vehicle(VehicleType type) {
        this.type = type;
        Random random = new Random();
        this.id = random.nextLong();
    }
    public Long getId(){
        return this.id;
    }
    public VehicleType getType(){
        return this.type;
    }
    public void setType(VehicleType type){
        this.type = type;
    }
    
}
