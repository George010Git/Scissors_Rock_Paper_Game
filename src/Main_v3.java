import java.util.Random;
import java.util.Scanner;

public class Main_v3 {
    public static void main(String[] args) {

        /*  Scissors, rock, paper
         * Write a program that asks Player1 for a number between 1 and 3 and displays what he chose if he enters something else, display error
         * Write a program that asks Player2 for a number between 1 and 3 and displays what he chose if he enters something else, display error
         * Write a logic that compares what was entered first with what was entered 2nd and displays the corresponding result
         */


        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int player1Counter = 0;
        int player2Counter = 0;


        while (true) {
            System.out.print("Player 1, insert a number between 1 & 3: ");
            int player1 = sc.nextInt();
            System.out.println("Player 2, insert a number between 1 & 3: ");
            int player2 = rnd.nextInt(4);
            int scissors = 1;
            int rock = 2;
            int paper = 3;

            if (player1 < 1 || player1 > 3) {
                System.out.println("Error");
                System.out.println("The final score is: \nPlayer 1 score: " + player1Counter + " - Player 2 score: " + player2Counter);
                break;
            }

            if (player1 == scissors) {
                if (player2 == rock) {
                    System.out.println("Player 1 entered scissors");
                    System.out.println("Player 2 entered rock");
                    System.out.println("Player 1 Lose");
                    player2Counter++;
                } else if (player2 == paper) {
                    System.out.println("Player 1 entered scissors");
                    System.out.println("Player 2 entered paper");
                    System.out.println("Player 1 Win");
                    player1Counter++;
                } else {
                    System.out.println("Draw");
                }
            }
            if (player1 == rock) {
                if (player2 == paper) {
                    System.out.println("Player 1 entered rock");
                    System.out.println("Player 2 entered paper");
                    System.out.println("Player 1 Lose");
                    player2Counter++;
                } else if (player2 == scissors) {
                    System.out.println("Player 1 entered rock");
                    System.out.println("Player 2 entered scissors");
                    System.out.println("Player 1 Win");
                    player1Counter++;
                } else {
                    System.out.println("Draw");
                }
            }
            if (player1 == paper) {
                if (player2 == paper) {
                    System.out.println("Draw");
                } else if (player2 == scissors) {
                    System.out.println("Player 1 entered paper");
                    System.out.println("Player 2 entered scissors");
                    System.out.println("Player 1 Lose");
                    player2Counter++;
                } else {
                    System.out.println("Player 1 entered paper");
                    System.out.println("Player 2 entered rock");
                    System.out.println("Player 1 Win");
                    player1Counter++;
                }
            }

        }
    }
}