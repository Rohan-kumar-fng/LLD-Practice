
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExitGate {
    // This will calculate the intime and the outtime of the vehocle for payment
    // validate Ticket
    public LocalDateTime exitTime;
    public ExitGate(LocalDateTime exitTime){
        // this.exitTime = new Timestamp(System.currentTimeMillis()).toLocalDateTime();
        this.exitTime = exitTime;
    }
    public Boolean validateTicket(Ticket ticket){
        if(ticket.getEntryTime().isAfter(this.exitTime)){
            System.out.println("Entry Time is Before Exit");
            return false;
        }
        return true;
    }
    public Double calculatePayment(Ticket ticket){
        long timediff = ChronoUnit.SECONDS.between(this.exitTime , ticket.getEntryTime());
        return timediff * 1.0;
    }
}
