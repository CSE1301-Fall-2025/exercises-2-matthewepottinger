import java.util.Scanner;
public class tests {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int number = (int)(Math.random()*((10-1)+1))+1;
    int guess = -5;
    int guessCount = 0;
    while (guess != number) {
        guessCount++;
        System.out.println("Please enter a number from 1-10:");
        guess = scan.nextInt();
        if (guess == number) {
            System.out.println("You win!");
        } else if (guess > number) {
            if (guess <= 10) {
                System.out.println("Too high");
            }
        } else {
            if (guess >= 1) {
                System.out.println("Too low");
            }
        }
    }
     System.out.println("It took you " + guessCount + " guesses");


     
}
}