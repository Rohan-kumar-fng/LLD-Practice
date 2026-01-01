
import Splitwise.Expensetype;

public class Expense{
    private String expenseId;
    private String description;
    private double amount;
    private User paidBy;
    private List<Split> splits;
    private Expensetype expenseType;

    public Expense(double amount, String description, User paidBy, List<Split> splits, ExpenseType expenseType) {
        this.expenseId = UUID.randomUUID().toString();
        this.amount = amount;
        this.description = description;
        this.paidBy = paidBy;
        this.splits = splits;
        this.expenseType = expenseType;
    }

    public ExpenseType getExpenseType() {
        return expenseType; 
    }

    public String getExpenseId() {
        return expenseId;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

}