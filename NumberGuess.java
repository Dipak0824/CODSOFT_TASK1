package NumberGame;
import java.util.*;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int trail = 5;
        int number = min + (int) (max * Math.random());
        int num, guess;
        System.out.println("Choose any number between 1 to 100");
        System.out.println("You have 5 chances to guess the correct number");
        for (num = 1; num <= trail; num++) {
            System.out.println("Guess the number:");
            guess = obj.nextInt();
            if (number == guess) {
                System.out.println("Bravoo!! You guessed the correct number");
                break;
            } else if (number > guess) {
                System.out.println("Number is greater than the guess");
            } else if (number < guess) {
                System.out.println("Number is less than the guess");
            }
        }
        if (num > trail) {
            System.out.println("Oops Your trials are finished");
            System.out.println("The number was " + number);
        }
    }

}
