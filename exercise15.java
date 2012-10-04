package exercises;

import java.util.Scanner; 

public class exercise15 {
    public static void main(String[] args) {
        System.out.println("Try and guess my number!");
        boolean finished = false;
        int numberToGuess = (int) Math.abs(1000 * Math.random());
        int guessCount = 0;
        int guess;
//        String guessStr = "";
        Scanner keyboard = new Scanner(System.in);
        while(!finished){
            System.out.print("Tell me a number: ");
//            guessStr = System.console().readLine();
//            guess = Integer.parseInt(guessStr);
            // System.console().readLine() did not work inside a loop so had to use scanner.
            guess = keyboard.nextInt();
            if(guess == numberToGuess) {
                finished = true;
            }else if(guess < numberToGuess) {
                System.out.println("No! My number is higher.");
            }else if(guess > numberToGuess) {
                System.out.println("No! My number is lower.");
            }
            guessCount++;
        }
        System.out.println("Correct!");
        System.out.println("You needed " + guessCount + " guesses.");
    }
}