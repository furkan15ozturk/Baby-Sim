import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int minAccountNumber = 0;
        int maxAccountNumber = 1000000;

        User user = new User();
        Parent parent = new Parent();

        System.out.println("Your name: ");
        String yourName = input.next();
        parent.set_name(yourName);

        System.out.println("Your surnname: ");
        String yourSurname = input.next();
        parent.set_surname(yourSurname);

        System.out.println("Your age:");
        int yourAge = input.nextInt();
        parent.set_age(yourAge);

        getPhase(yourAge, parent);

        user.set_name(parent.get_name());
        user.set_surname(parent.get_surname());
        user.set_age(parent.get_age());
        user.set_phases(parent.get_phases());
        user.setAccountNumber(random.nextInt(maxAccountNumber - minAccountNumber) + minAccountNumber);

        System.out.println("\nAccount Number: " + user.getAccountNumber()
                + "\nName: " + user.get_name() + "\nSurname: " + user.get_surname()
                + "\nAge: " + user.get_age() + "\nPhase: " + user.get_phases()
                + "\nBalance: " + user.get_balance());

    }

    public static void getCredits(User user){

        if (user.is_canGetCredits()){
            user.set_balance(user.get_balance() + user.get_creditAmount());
            user.set_canGetCredits(false);
        }
        else {
            user.set_balance(user.get_balance());
        }

    }

    public static void getPhase(int yourAge, Human human){
        if(yourAge >= 0 && yourAge<4)
            human.set_phases(Human.Phases.Baby);
        if(yourAge >= 4 && yourAge<12)
            human.set_phases(Human.Phases.Child);
        if(yourAge >= 12 && yourAge<18)
            human.set_phases(Human.Phases.Teenage);
        if(yourAge >= 18 && yourAge<50)
            human.set_phases(Human.Phases.Adult);
        if(yourAge >= 50 && yourAge<100)
            human.set_phases(Human.Phases.Old);
    }

}