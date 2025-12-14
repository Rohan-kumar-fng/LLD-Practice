public class Elevator{
    private Integer id;
    private Integer currentFloor;
    private String status;
    private Boolean active;
    Elevator(Integer floor, Integer id){
        this.currentFloor = floor;
        this.status = "IDLE";
        this.active = true;
        this.id = id;
    }
    public void setCurrentFloor(Integer floor){
        this.currentFloor = floor;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setActive(Boolean active){
        this.active = active;
    }
    public Integer getCurrentFloor(){
        return this.currentFloor;
    }
    public String getStatus(){
        return this.status;
    }
    public Boolean active(){
        return this.active;
    }
    public Integer getId(){
        return this.id;
    }
}