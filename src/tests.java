import java.util.Scanner;
public class tests {

public static int arrayReader (int[] array) {
    int findMax = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] > findMax) {
            findMax = array[i];
        }
    }
    return findMax;
}
    public static void main(String[] args) {

    int[] numbers = {12, 4, 18, 34, 6, 8};
    int max = arrayReader(numbers);
    System.out.println(max);

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