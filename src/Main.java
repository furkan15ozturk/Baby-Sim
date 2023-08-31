import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int minAccountNumber = 0;
        int maxAccountNumber = 1000000;

        //********************** User Settings **********************

        User user = new User();
        Parent parent = new Parent();

        System.out.println("Your name: ");
        String yourName = input.next();
        parent.setName(yourName);

        System.out.println("Your surname: ");
        String yourSurname = input.next();
        parent.setSurname(yourSurname);

        System.out.println("Your age:");
        int yourAge = input.nextInt();
        parent.setAge(yourAge);

        System.out.println("Your gender:\nChoose 1 for male, 2 for female.");
        int genderChoice = input.nextInt();
        switch (genderChoice){
            case 1:
                System.out.println("Your gender is male.");
                parent.setGender(Human.Gender.Male);
            case 2:
                System.out.println("Your gender is female.");
                parent.setGender(Human.Gender.Female);
        }
        getPhase(yourAge, parent);

        user.setName(parent.getName());
        user.setSurname(parent.getSurname());
        user.setAge(parent.getAge());
        user.setPhases(parent.getPhases());
        user.setAccountNumber(random.nextInt(maxAccountNumber - minAccountNumber) + minAccountNumber);

        System.out.println("\nAccount Number: " + user.getAccountNumber()
                + "\nName: " + user.getName() + "\nSurname: " + user.getSurname()
                + "\nAge: " + user.getAge() + "\nPhase: " + user.getPhases()
                + "\nBalance: " + user.get_balance());

        //********************** Baby Settings **********************

        System.out.println("How many babies would you like to take care of?");
        int babyCount = input.nextInt();

        while(true){
            if (babyCount >= 0 && babyCount <= 3){
                break;
            }
        }
        Baby[] baby = new Baby[babyCount];

        switch (babyCount) {
            case 0 -> {
                System.out.println("Exiting the application! You must have kids to play this game.");
                System.exit(0);
            }
            case 1 -> {

                //Baby 1
                baby[0] = new Baby();
                System.out.println("What would you name your baby, your successor, your only sprout?");
                String babyName = input.next();
                baby[0].setName(babyName);
                System.out.println("Remember! Your baby is your successor. Thus, your baby has the same surname as you.");
                System.out.println("What gender is your baby?");
                System.out.println("Your gender:\nChoose 1 for male, 2 for female.");

                int babyGenderChoice = input.nextInt();

                switch (babyGenderChoice){
                    case 1:
                        System.out.println("Your baby's gender is male.");
                        baby[0].setGender(Human.Gender.Male);
                    case 2:
                        System.out.println("Your baby's gender is female.");
                        baby[0].setGender(Human.Gender.Female);
                }
                baby[0].setSurname(parent.getSurname());
                baby[0].setAge(0);
                baby[0].setBabyState(Events.events.babySleeping);
                System.out.println("You have made a baby... But how did- anyway. Congratulations!");
                System.out.println("Your baby is sleeping. Don't wake up your baby, or else he will wake up and cry!\nNo, no! Don't do that! Do you really want to wake up your baby? (Say yes if you would like to wake your baby!)");
                String wakeBaby = input.next();
                if(wakeBaby.toLowerCase().contains("yes") || wakeBaby.toLowerCase().contains("yeah") || wakeBaby.toLowerCase().contains("sure") || wakeBaby.toLowerCase().contains("of course")){
                    baby[0].setBabyState(Events.events.babyCrying);
                    System.out.println("Oh, that's great. You made your baby cry. What a great parent you are!");
                }else {
                    System.out.println("Oh, nice. The baby really should be sleeping right now.");
                }

            }
        }

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
            human.setPhases(Human.Phases.Baby);
        if(yourAge >= 4 && yourAge<12)
            human.setPhases(Human.Phases.Child);
        if(yourAge >= 12 && yourAge<18)
            human.setPhases(Human.Phases.Teenage);
        if(yourAge >= 18 && yourAge<50)
            human.setPhases(Human.Phases.Adult);
        if(yourAge >= 50 && yourAge<100)
            human.setPhases(Human.Phases.Old);
    }

}