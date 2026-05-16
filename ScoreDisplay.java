import java.util.Scanner;
import java.util.Random;

public class ScoreDisplay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        do {

            int randomNumber = rand.nextInt(100) + 1;
            int guess = 0;

            while (guess != randomNumber) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                if (guess > randomNumber) {
                    System.out.println("Too High!");
                }
                else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                }
                else {
                    System.out.println("Correct Guess!");
                    score++;
                }
            }

            System.out.println("Your Score is: " + score);

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Final Score: " + score);

        sc.close();
    }
}
