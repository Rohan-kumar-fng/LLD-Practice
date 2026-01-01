import java.util.List;
import java.util.Map;

public class ExpenseManager {
    // This contains many Expense that needs to be managed here
    // this class is just the orchestrator of the flow of the splitwise App
    // Functionality:-
    // addExpense -> update balancebook ->
    // call ExpenseService to split the expenses among the users
    // call ExpenseService to settle any expense between the users
    // showExpense for some user
    // show Expense for whole user

    // this showing of the Expense needs to get data from Service , So the Mapping of the user data must be done inside the Service layer

    // ehat funcional I need to add here?

    private ExpenseService expenseService;

    public ExpenseManager() {
        this.expenseService = new ExpenseService();
    }

    public void addExpense(Expense expense) {
        this.expenseService.addExpense(expense);
    }

    public void showExpense(User user) {
        this.expenseService.showExpense(user);
    }

    public void showWholeExpense() {
        this.expenseService.showWholeExpense();
    }
}



































    // private Map<String, User> users;
    // private List<Expense> expenses;

    // public ExpenseManager() {
    //     users = new HashMap<>();
    //     expenses = new ArrayList<>();
    // }

    // public void addUser(User user) {
    //     users.put(user.getId(), user);
    // }

    // public User getUser(String userId) {
    //     return users.get(userId);
    // }

    // public void addExpense(Expense expense) {
    //     expenses.add(expense);
    // }

    // public List<Expense> getExpenses() {
    //     return expenses;
    // }

    // public Map<String, Double> getBalances() {
    //     Map<String, Double> balances = new HashMap<>();
    //     for (User user : users.values()) {
    //         balances.put(user.getId(), 0.0);
    //     }

    //     for (Expense expense : expenses) {
    //         String payerId = expense.getPayer().getId();
    //         double totalAmount = expense.getAmount();
    //         List<Split> splits = expense.getSplits();

    //         // Deduct from payer
    //         balances.put(payerId, balances.get(payerId) + totalAmount);

    //         // Add to beneficiaries
    //         for (Split split : splits) {
    //             String beneficiaryId = split.getUser().getId();
    //             double amountOwed = split.getAmount();
    //             balances.put(beneficiaryId, balances.get(beneficiaryId) - amountOwed);
    //         }
    //     }
    //     return balances;
    // }

    // public void showBalances() {
    //     Map<String, Double> balances = getBalances();
    //     boolean anyBalance = false;
    //     for (Map.Entry<String, Double> entry : balances.entrySet()) {
    //         if (entry.getValue() != 0) {
    //             anyBalance = true;
    //             System.out.println(users.get(entry.getKey()).getName() + ": " + entry.getValue());
    //         }
    //     }
    //     if (!anyBalance) {
    //         System.out.println("No balances");
    //     }
    // }

    // public void showBalance(String userId) {
    //     Map<String, Double> balances = getBalances();
    //     boolean anyBalance = false;
    //     for (Map.Entry<String, Double> entry
//}
