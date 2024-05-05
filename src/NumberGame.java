import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int random_number = random.nextInt(1,101);

        for (int no_of_attempts = 1;no_of_attempts<=5;no_of_attempts++){
            System.out.println("Enter your guess :");
            int player_guess = scanner.nextInt();
            if (player_guess == random_number){
                System.out.println("Correct! You won!!!");
                System.out.println("Your total attempts is :"+no_of_attempts);
                break;
            }
            else if (player_guess > random_number) {
                System.out.println("Your guess is higher");
                if (no_of_attempts == 5)
                    System.out.println("Oops! You lose the game");
            }
            else {
                System.out.println("Your guess is lower");
                if (no_of_attempts == 5)
                    System.out.println("Oops! You lose the game");
            }
        }
    }
}
