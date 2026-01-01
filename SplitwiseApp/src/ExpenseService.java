import java.util.HashMap;

import java.util.Map;

// Just the pure logic
public class ExpenseService {
    Map<User, Map<User, Double>> balances;

    public ExpenseService() {
        this.balances = new HashMap<>();
    }

    // addExpense
    public void addExpense(Expense expense) {
        User paidBy = expense.getPaidBy();
        for (Split split : expense.getSplits()) {
            User paidTo = split.getUser();
            double amount = split.getAmount();

            // Update balance sheet
            // paidBy gets +amount from paidTo
            // paidTo owes amount to paidBy

            Map<User, Double> balancesForPaidBy = balances.getOrDefault(paidBy, new HashMap<>());
            if (!paidBy.equals(paidTo)) {
                balancesForPaidBy.put(paidTo, balancesForPaidBy.getOrDefault(paidTo, 0.0) + amount);
                balances.put(paidBy, balancesForPaidBy);

                Map<User, Double> balancesForPaidTo = balances.getOrDefault(paidTo, new HashMap<>());
                balancesForPaidTo.put(paidBy, balancesForPaidTo.getOrDefault(paidBy, 0.0) - amount);
                balances.put(paidTo, balancesForPaidTo);
            }
        }
    }

    public void showWholeExpense() {
        for (User fromuser : balances.keySet()) {
            Map<User, Double> amountOwned = balances.getOrDefault(fromuser, new HashMap<>());
            for (User touser : amountOwned.keySet()) {
                System.out.println("User: " + fromuser.getName() + " owned " + touser.getName() + " amount: "
                        + amountOwned.getOrDefault(touser, 0.0));
            }
            System.out.println();
        }
    }

    public void showExpense(User user) {
        Map<User, Double> userBalance = balances.getOrDefault(user, new HashMap<>());
        if (userBalance.isEmpty()) {
            System.out.println("User " + user.getName() + " does not own anything.");
            return;
        }
        for (User touser : userBalance.keySet()) {
            System.out.println(
                    "User: " + user.getName() + "Owned: " + touser.getName() + " anount: " + userBalance.get(touser));
        }
    }
    // showExpense
    // showAllExpense
}
