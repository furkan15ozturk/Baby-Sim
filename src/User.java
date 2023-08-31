public class User extends Human{
    private int accountNumber = 0;
    private int creditAmount = 200;
    private boolean canGetCredits = true;
    private int balance = 200;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int get_creditAmount() {
        return creditAmount;
    }

    public void set_creditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    public int get_balance() {
        return balance;
    }

    public void set_balance(int balance) {
        this.balance = balance;
    }

    public boolean is_canGetCredits() {
        return canGetCredits;
    }

    public void set_canGetCredits(boolean canGetCredits) {
        this.canGetCredits = canGetCredits;
    }
}
