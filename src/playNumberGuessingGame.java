import java.util.Scanner;

public class playNumberGuessingGame {
    public static void main(String[] args) {
        playGame(); // Calling the method playGame()
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());
        int maxAttempts = 5;

        System.out.println("A number is chosen between 1 to 100.");
        System.out.println("Guess the number within 5 trials.");

        int i; // Declare the loop counter outside the loop
        for (i = 0; i < maxAttempts; i++) {
            System.out.print("Attempt " + (i + 1) + "/" + maxAttempts + ": Guess the number: ");
            int guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You got the number.");
                break;
            } else if (number > guess && i != maxAttempts - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != maxAttempts - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == maxAttempts) {
            System.out.println("You have exhausted " + maxAttempts + " trials.");
            System.out.println("The number was " + number);
        }

        sc.close();
    }
}
