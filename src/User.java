public class User extends Human{
    private int _accountNumber = 0;
    private int _creditAmount = 200;
    private boolean _canGetCredits = true;
    private int _balance = 200;

    public int getAccountNumber() {
        return _accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        _accountNumber = accountNumber;
    }

    public int get_creditAmount() {
        return _creditAmount;
    }

    public void set_creditAmount(int creditAmount) {
        _creditAmount = creditAmount;
    }

    public int get_balance() {
        return _balance;
    }

    public void set_balance(int balance) {
        _balance = balance;
    }

    public boolean is_canGetCredits() {
        return _canGetCredits;
    }

    public void set_canGetCredits(boolean canGetCredits) {
        _canGetCredits = canGetCredits;
    }
}
