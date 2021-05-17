package com.company;
import java.util.Scanner;

public class Lottery {

    public static void lottoNumbers(){

        Scanner input = new Scanner(System.in);

        System.out.println("\n***** LOTTERY GAME *****");
        System.out.println("Want to play a lottery game? Type 'yes' or 'no'.");
        String lottoChoice = input.nextLine();
        if(lottoChoice.equals("yes") || lottoChoice.equals("y") || lottoChoice.equals("Yes") || lottoChoice.equals("Y")){
            System.out.println("Good deal!");
        }else{
            System.out.println("Bye dude... ");
            return;
        }

        int lottoArray[] = new int[5];
        for(int i = 0; i < 5; i++){
            int num = (int)(Math.random()*65);
            lottoArray[i]=num;
        }

        int magicBall = (int)(Math.random()*75);

        System.out.print("Your lotto numbers are ");

        for(int x = 0; x < lottoArray.length; x++){
            System.out.print(lottoArray[x] + " ");
        }
        System.out.println("\nMagic ball number is " + magicBall);

        replayGame();

    }
    public static void replayGame() {
        Scanner input = new Scanner(System.in);

        System.out.println("Wanna play again? Type 'yes' or 'no'");
        String playAgain = input.nextLine();
        if (playAgain.equals("yes") || playAgain.equals("y")) {
            System.out.println("Let go!");
            lottoNumbers();
        } else {
            System.out.println("See you later...");
            return;
        }
    }
}
