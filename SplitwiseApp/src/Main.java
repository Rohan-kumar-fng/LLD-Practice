import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Firstly create the various users
        User user1 = new User("u1", "abhishek", "abhishek@gmail.com", "9435734573");
        User user2 = new User("u2", "ravi", "ravi@gmail.com", "94357349973");
        User user3 = new User("u3", "satish", "satish@gmail.com", "9438334573");
        User user4 = new User("u4", "satya", "satya@gmail.com", "9433468273");

        // Case 1 user1 paid 1000, need to split equally among 4
        // Case 1 user1 paid 1000, need to split equally among 4
        Double amount = 1000.0;
        List<User> userInvolved = Arrays.asList(user1, user2, user3, user4);
        List<Split> splits1 = new ArrayList<>();
        for (User user : userInvolved) {
            Split split = new EqualSplit(user);
            split.setAmount(amount / userInvolved.size());
            splits1.add(split);
        }
        Expense expense = new Expense(amount, user1, splits1, new ExpenseMetadata("Wifi", "url", "notes"));

        Double amount2 = 439.0;
        List<Split> splits2 = new ArrayList<>();
        // 10%, 20%, 30%, 40%
        splits2.add(new PercentageSplit(user1, 10.0));
        splits2.add(new PercentageSplit(user2, 20.0));
        splits2.add(new PercentageSplit(user3, 30.0));
        splits2.add(new PercentageSplit(user4, 40.0));

        for (Split split : splits2) {
            PercentageSplit pSplit = (PercentageSplit) split;
            split.setAmount(amount2 * pSplit.getPercentage() / 100.0);
        }

        Expense expense2 = new Expense(amount2, user1, splits2, new ExpenseMetadata("Electricity", "url", "notes"));

        // Firstly I have to understand How to take input here
        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.addExpense(expense);
        expenseManager.addExpense(expense2);

        expenseManager.showWholeExpense();
        expenseManager.showExpense(user3);
    }
}