public class Split{
    private String splitId;
    private User user;
    private Double amountShare;
    public Split(String splitId, User user, Double amountShare){
        this.splitId = splitId;
        this.user = user;
        this.amountShare = amountShare;
    }
    public String getSplitId(){
        return this.splitId;
    }

    public User getUser(){
        return this.user;
    }

    public Double getAmountShare(){
        return this.amountShare;
    }

    public void setAmountShare(Double amountShare){
        this.amountShare = amountShare;
    }


}