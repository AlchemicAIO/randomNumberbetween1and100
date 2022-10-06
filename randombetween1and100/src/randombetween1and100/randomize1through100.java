package randombetween1and100;

import java.util.Random;
import java.util.Scanner;

public class randomize1through100 {

    public static void main(String[] args) {

        int answer, guess, attemptsNum = 0;
        final int maxAttempts = 5;
        String str, another = "y";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        answer = generator.nextInt(101) + 1;

        while (another.equals("y") || another.equals("Y")) {
            System.out.println("Guess a number between 1 and 100");

            System.out.println("Enter your guess:");

            guess = scan.nextInt();
            attemptsNum = 0;
            while (guess != 0)

            {
                attemptsNum++;
                if (guess == answer) {
                    System.out.println("Correct! You have chosen the correct number!");
                    break;
                } else if (guess < answer)
                    System.out.println("Incorrect! Your number is too low! Try Again!");
                else if (guess > answer)
                    System.out.println("Incorrect! Your number is too high! Try again!");

                if (attemptsNum == maxAttempts) {
                    System.out.println("The number was " + answer);
                    break;

                }

                System.out.println("Enter your guess (0 to quit):");
                guess = scan.nextInt();
            }

            System.out.println("You have ran out of chances.");
            
        }
        System.out.println("Thanks for playing");
    }
}