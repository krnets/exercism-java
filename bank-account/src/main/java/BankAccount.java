public class BankAccount {

    private int accountBalance;
    private boolean accountOpen;

    public void open() {
        accountOpen = true;
        accountBalance = 0;
    }

    public void deposit(int amount) throws BankAccountActionInvalidException {
        if (!accountOpen) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        synchronized (this) {
            accountBalance += amount;
        }
    }
    public int getBalance() throws BankAccountActionInvalidException {
        if (!accountOpen) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        return accountBalance;
    }

    public void withdraw(int amount) throws BankAccountActionInvalidException {
        if (!accountOpen) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        if (accountBalance == 0) {
            throw new BankAccountActionInvalidException(
                    "Cannot withdraw money from an empty account");
        }
        if (accountBalance - amount < 0) {
            throw new BankAccountActionInvalidException(
                    "Cannot withdraw more money than is currently in the account");
        }
        if (accountBalance >= amount) {
            synchronized (this) {
                accountBalance -= amount;
            }
        }
    }

    public void close() {
        accountOpen = false;
    }
}