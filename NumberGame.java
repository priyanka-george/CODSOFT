import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char play;

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 5;
            boolean win = false;

            System.out.println("Guess a number between 1 and 100");

            while (attempts > 0) {
                System.out.print("Enter guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct!");
                    score++;
                    win = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!win)
                System.out.println("Correct Number: " + number);

            System.out.println("Score: " + score);
            System.out.print("Play Again (y/n): ");
            play = sc.next().charAt(0);

        } while (play == 'y' || play == 'Y');

        sc.close();
    }
}