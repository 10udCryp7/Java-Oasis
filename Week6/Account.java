import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private final ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * this function helps us deposit money.
     *
     * @param amount the amount of money we want to deposit.
     */
    private void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * this function helps us withdraw the money.
     *
     * @param amount the amount of money we want to withdraw.
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * this function saves transaction.
     *
     * @param amount    the amount of money.
     * @param operation deposit or withdraw.
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            deposit(amount);
            Transaction transaction = new Transaction(operation, amount, this.balance);
            transitionList.add(transaction);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            withdraw(amount);
            Transaction transaction = new Transaction(operation, amount, this.balance);
            transitionList.add(transaction);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * this function print transaction.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); ++i) {
            int number = i + 1;
            if (transitionList.get(i).getOperation() == Transaction.DEPOSIT) {
                String transition = "Giao dich " + number + ": "
                        + "Nap tien $"
                        + String.format("%.2f", transitionList.get(i).getAmount())
                        + ". So du luc nay: $"
                        + String.format("%.2f", transitionList.get(i).getBalance())
                        + ".";
                System.out.println(transition);
            } else if (transitionList.get(i).getOperation() == Transaction.WITHDRAW) {
                String transition = "Giao dich " + number + ": "
                        + "Rut tien $"
                        + String.format("%.2f", transitionList.get(i).getAmount())
                        + ". So du luc nay: $"
                        + String.format("%.2f", transitionList.get(i).getBalance())
                        + ".";
                System.out.println(transition);
            }
        }
    }

    /**
     * just main.
     * 
     * @param args nothing.
     */
    public static void main(String[] args) {
        Account ac = new Account();
        ac.addTransaction(1000, Transaction.DEPOSIT);
        ac.addTransaction(500, Transaction.WITHDRAW);
        ac.printTransaction();
    }
}
