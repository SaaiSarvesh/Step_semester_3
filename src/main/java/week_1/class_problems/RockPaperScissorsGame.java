package week_1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};
        int totalRounds = 5;

        String[][] scoreboard = new String[totalRounds][4];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("=== College Coding Arcade: Rock-Paper-Scissors ===");

        for (int i = 0; i < totalRounds; i++) {
            System.out.printf("%nRound %d - Enter move (Rock, Paper, Scissors): ", i + 1);
            String playerMove = scanner.nextLine().trim();
            while (!playerMove.equalsIgnoreCase("Rock") && 
                   !playerMove.equalsIgnoreCase("Paper") && 
                   !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid move. Enter Rock, Paper, or Scissors: ");
                playerMove = scanner.nextLine().trim();
            }
            playerMove = playerMove.substring(0, 1).toUpperCase() + playerMove.substring(1).toLowerCase();
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
            scoreboard[i][0] = String.valueOf(i + 1);
            scoreboard[i][1] = playerMove;
            scoreboard[i][2] = computerMove;
            scoreboard[i][3] = result;

            System.out.printf("Computer chose: %s | Result: %s%n", computerMove, result);
        }
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-8s | %-12s | %-14s | %-12s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < totalRounds; i++) {
            System.out.printf("%-8s | %-12s | %-14s | %-12s%n",
                    scoreboard[i][0], scoreboard[i][1], scoreboard[i][2], scoreboard[i][3]);
        }
        System.out.println("-------------------------------------------------------------");
        double winPercentage = ((double) wins / totalRounds) * 100;
        System.out.printf("Final Summary: Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);

        scanner.close();
    }
}