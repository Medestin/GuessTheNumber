import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the guessing game!" +
                "\nYou have ten chances to guess a random number from 1-100 range!\n");

        //Make a random 0-0.99 double, multiply by 100 and cast to int to get 0-99. Add one for 1-100 range.
        double number = Math.random() * 100;
        int randomNumber = (int) number;
        randomNumber++;

        //For test purposes print the number first:
//        System.out.println("The double of random number is: " + number);
//        System.out.println("The random number is: " + randomNumber);

        //Creating a scanner for user input:
        Scanner scanner = new Scanner(System.in);

        /**The guess game:
         * Pretty simple. You guess, you miss, you try again, untill you guess right. Or run out of tries.
         * @param guessCounter counts how many guesses are left(Clockdown of DEATH!!!)
         * @param guess is a simple storage integer for user input
         *
         * It's just a loop, really.
         */
        for (int guessCounter = 10; 0 <= guessCounter; guessCounter--) {

            //Checks if you have guesses left. If this were at the end you'd have one more guess.
            if (guessCounter == 0) {
                System.out.println("Sorry, you ran out of guesses. LOSER.");
                System.out.println("By the way, the number was " + randomNumber + " How close were you?");
                break;
            }

            //Tells you how many guesses you have left and asks for user input.
            System.out.println("Number of guesses left: " + guessCounter + ". Take a guess!");
            System.out.println("Your guess is: ");

            //Too high? Too low? Just about right? If else will tell you!


            try {
               int guess = scanner.nextInt();



            if (guess > 100) {
                System.out.println("Out of range, can't you read a simple instruction? Between 1 and a 100!");
            } else if (guess < 0){
                System.out.println("Out of range, can't you read a simple instruction? Between 1 and a 100!");
            }

            else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess == randomNumber) {
                System.out.println("CONTGRATULATIONS, YOU WIN. Guesses left: " + guessCounter);
                break;
            }
            } catch(InputMismatchException exception){
                System.out.println("A NUMBER. IS IT THAT HARD TO TYPE IN A NUMBER? Game over pal.");
                break;


            }

        }


    }


}
