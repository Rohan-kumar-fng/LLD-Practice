public class PercentageSplit extends Split{
    private double percentage;

    public PercentageSplit(User name, double amount, double percentage) {
        super(name, amount);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
