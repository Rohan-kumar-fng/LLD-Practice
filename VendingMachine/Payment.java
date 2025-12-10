public class Payment{
    private String id;
    private Boolean isPaymentCompleted;
    private String modeOfPayment;
    private Double cashInserted;
    private Double cashReturned;
    // payment mode have three options, Cash CArd UPI, ecause of which I need to impleemnt a interface
    public Boolean processPayment(Product p,String modeOfPayment, Double cashInserted ){
        if(modeOfPayment.equals("Cash")){
            if(validatePayment(p.getPrice(),cashInserted)){
                this.cashReturned = manageChange(p.getPrice(),cashInserted);
                this.isPaymentCompleted = true;
                return true;
            } else {
                this.isPaymentCompleted = false;
                return false;
            }
        } else {
            if(validatePaymentCard(p)){
                this.isPaymentCompleted = true;
                return true;
            } else {
                this.isPaymentCompleted = false;
                return false;
            }
        }
    }
    private Boolean validatePayment(Double productPrice,Double cashInserted){
        if(cashInserted < productPrice){
            return false;
        }
        return true;
    }
    private Boolean validatePaymentCard(Product p){
        return true;
    }
    public Double manageChange(Double productPrice,Double cashInserted){
        return cashInserted - productPrice;
    }
    public Boolean isPaymentCompleted(){
        return this.isPaymentCompleted;
    }

}