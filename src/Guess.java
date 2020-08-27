import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){


        Scanner keybd = new Scanner(System.in);
        int answer, guess;
        Random randomNumber = new Random(); //
        answer = randomNumber.nextInt(10) + 1; // if you type 4, it selects random number from 0-3

// System.out.println("pssst: answer is " + answer);
        System.out.println("Guess a number from 1-10 (-1 to quit): ");
        guess = keybd.nextInt();
        while (guess != answer) {
            if (guess < answer && guess != -1) {
                System.out.println("Too low. Try again: ");
                guess = keybd.nextInt();
            } else if (guess > answer) {
                System.out.println("Too high. Try again: ");
                guess = keybd.nextInt();
            }

            if (guess == -1){
                break;
            }

        }
        if (guess != -1){
            System.out.println("You win!");
        } else {
            System.out.println("Sorry! The answer was : " + answer);
        }

    }

}
