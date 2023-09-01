import java.util.Objects;
import java.util.Random;
import java.lang.Thread;
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
        input.nextLine();
        parent.setName(yourName);

        System.out.println("Your surname: ");
        String yourSurname = input.next();
        input.nextLine();
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
                //*********************************** Baby 1 ***********************************
                baby[0] = babyCreator(parent);

            }
            case 2 -> {
                //*********************************** Baby 1 ***********************************
                baby[0] = babyCreator(parent);

                //*********************************** Baby 2 ***********************************
                baby[1] = babyCreator(parent);
            }
            case 3 -> {
                //*********************************** Baby 1 ***********************************
                baby[0] = babyCreator(parent);

                //*********************************** Baby 2 ***********************************
                baby[1] = babyCreator(parent);

                //*********************************** Baby 3 ***********************************
                baby[2] = babyCreator(parent);

            }
        }

        System.out.println("Remember! Your baby is your successor. Thus, your baby has the same surname as you.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You have made a baby, or babies... But how did- anyway. Congratulations!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your baby/babies is/are sleeping. Don't wake up your baby, or else he will wake up and cry!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Would you like to see your baby's information?");
        String checkBabyInfo = input.next();
        if (removePunctuations(checkBabyInfo).toLowerCase().contains("yes") || removePunctuations(checkBabyInfo).toLowerCase().contains("yeah") || removePunctuations(checkBabyInfo).toLowerCase().contains("of course")){
            System.out.println("Here is your baby's information:");
            for(int i=0; i<baby.length; i++) {
                System.out.println("Baby's Name: " + baby[i].getName());

                System.out.println("Baby's Surname: " + baby[i].getSurname());

                System.out.println("Baby's Age: " + baby[i].getAge());

                System.out.println("Baby's Gender: " + baby[i].getGender());

                System.out.println("Baby's State: " + baby[i].getBabyState());
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

    public static Baby babyCreator(Parent parent){
        Scanner input = new Scanner(System.in);
        Baby baby = new Baby();

        System.out.println("What would you name your baby?");
        String firstBabyName = input.next();
        input.nextLine();
        baby.setName(firstBabyName);
        System.out.println("What gender is your baby?");
        System.out.println("Choose 1 for male, 2 for female.");

        int firstBabyGenderChoice = input.nextInt();
        input.nextLine();

        switch (firstBabyGenderChoice){
            case 1:
                System.out.println("Your baby's gender is male.");
                baby.setGender(Human.Gender.Male);
            case 2:
                System.out.println("Your baby's gender is female.");
                baby.setGender(Human.Gender.Female);
        }
        baby.setSurname(parent.getSurname());
        baby.setAge(0);
        baby.setBabyState(Events.events.babySleeping);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ");

        return baby;
    }

    public static String removePunctuations(String source) {
        return source.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
    }
}