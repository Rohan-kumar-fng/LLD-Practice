public class Request{
    private Integer id;
    private Integer sourceFloor;
    private Integer destinationFloor;
    private String direction;
    Request(Integer sourceFloor, Integer destinationFloor){
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
        if(destinationFloor < sourceFloor) this.direction = "DOWN";
        else this.direction = "UP";
    }
    public void setSourceFloor(Integer floor){
        this.sourceFloor = floor;
    }
    public void setDestinationFloor(Integer floor){
        this.destinationFloor = floor;
    }
    public void setDirection(String direction){
        this.direction = direction;
    }
    public Integer getSourceFloor(){
        return this.sourceFloor;
    }
    public Integer getDestinationFloor(){
        return this.destinationFloor;
    }
    public String getDirectiion(){
        return this.direction;
    }
}