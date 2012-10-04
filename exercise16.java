package exercises;

import java.util.*;

public class exercise16 {
    public static void main(String[] args) {
        boolean finished = false;
        Scanner input = new Scanner(System.in);
        int playerOneScore = 0, playerTwoScore = 0;
        String game;
        
        // Winning combinations for each player.
        String[] playerOneWins = {"PR", "RS", "SP"}, playerTwoWins = {"RP", "RS", "PS"};
        // and draws.
        String[] draw = {"PP", "RR", "SS"};
        System.out.println("First to a lead of three wins!");
        // Main game loop.
        while(!finished){
            System.out.print("Input new game: ");
            game = input.nextLine();
            // Checks the result arrays for the result of the game
            // incrementing scores if a player has won.
            if (Arrays.asList(playerOneWins).contains(game)) {
                playerOneScore++;
                System.out.println("Player one wins!");
            }else if (Arrays.asList(playerTwoWins).contains(game)) {
                playerTwoScore++;
                System.out.println("Player two wins!");
            }else if (Arrays.asList(draw).contains(game)) {
                System.out.println("That was a draw!");
            }else {
                System.out.println("Not a valid game!");
            }
            // Now checks to see if either player is 3 games ahead.
            if ( playerOneScore-playerTwoScore==3 || playerTwoScore-playerOneScore==3 ) {
                finished = true;
            }
        }
        System.out.println("Game over! Player One Scores: " + playerOneScore + " Player Two Scores: " + playerTwoScore);
    } 
}
