import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int minAccountNumber = 0;
        int maxAccountNumber = 1000000;

        User user = new User();
        user.set_name("Furkan");
        user.set_surname("Öztürk");
        user.set_phases(Human.Phases.Adult);
        user.set_age(22);
        user.setAccountNumber(random.nextInt(maxAccountNumber - minAccountNumber) + minAccountNumber);
        System.out.println("\nAccount Number: " + user.getAccountNumber()
                + "\nName: " + user.get_name() + "\nSurname: " + user.get_surname()
                + "\nAge: " + user.get_age() + "\nPhase: " + user.get_phases()
                + "\nBalance: " + user.get_balance());

    }

    public void getCredits(User user){
        user.set_balance(user.get_balance() + user.get_creditAmount());
        user.set_canGetCredits(false);

    }
}