package com.company;

import java.util.Scanner;

public class Questions {

    public static void userQuestions() {
//        Asking user's name
        Scanner input = new Scanner(System.in);

        System.out.println("\n***** QUESTIONNAIRE *****");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);

//      Continue with interactive portion question
        System.out.println("Do you want to continue with the survey? Type 'yes' or 'no'.");
        String answer = input.nextLine();
        if(answer.equals("yes") || answer.equals("y") || answer.equals("Yes") || answer.equals("Y")){
            System.out.println("Great! Let's continue.");
        }else {
            System.out.println("No worries, come back later to complete the survey.");
            return;
        }

//        Asking user a bunch of questions.

        System.out.println("What's the name of your favorite pet?");
        String petName = input.nextLine();
        System.out.printf("%s must be a handful! \n", petName);
        System.out.printf("How old is %s? \n", petName);
        int petAge = input.nextInt();
        input.nextLine();
        System.out.printf("%s is %d years old! Cool. \n", petName, petAge);
        System.out.println("What is your lucky number?");
        int favNumber = input.nextInt();
        input.nextLine();
        System.out.printf("Nice, I like the number %d too. \n", favNumber);
//        IF statement for QB question
        System.out.println("Do you have a favorite quarterback? Type 'yes or 'no'.");
        String favQB = input.nextLine();
        if(favQB.equals("yes") || favQB.equals("Yes") || favQB.equals("y") || favQB.equals("Y")){
            System.out.println("Nice! What's their jersey number?");
            int jerseyNumber = input.nextInt();
            input.nextLine();
            System.out.printf("Nice, jersey number %d. \n", jerseyNumber);
        }else{
            System.out.println("Totally fine, I think sports are dumb too.");
        }

        System.out.println("What year was your car made?");
        int carYear = input.nextInt();
        input.nextLine();
        System.out.printf("%d was a good year. \n", carYear);
        System.out.println("What's the name of your favorite actor?");
        String favActor = input.nextLine();
        System.out.printf("Nice, I liked %s in Goodwill Hunting. \n", favActor);
        System.out.println("Enter a random number between 1 and 50.");
        int randomNumber = input.nextInt();
        if(randomNumber >= 1 && randomNumber <= 50) {
            System.out.printf("You chose %d as your number. \n", randomNumber);
        }else{
            System.out.println("Oh, you think you're funny...");
        }
    }
}
