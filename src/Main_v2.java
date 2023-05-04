import java.util.Scanner;

public class Main_v2 {
    public static void main(String[] args) {

        /*  Scissors, rock, paper
         * Write a program that asks Player1 for a number between 1 and 3 and displays what he chose if he enters something else, display error
         * Write a program that asks Player2 for a number between 1 and 3 and displays what he chose if he enters something else, display error
         * Write a logic that compares what was entered first with what was entered 2nd and displays the corresponding result
         */


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Player 1, insert a number between 1 & 3: ");
            int player1 = sc.nextInt();
            System.out.print("Player 2, insert a number between 1 & 3: ");
            int player2 = sc.nextInt();
            int scissors = 1;
            int rock = 2;
            int paper = 3;

            if (player1 == scissors) {
                if (player2 == rock) {
                    System.out.println("Player 1 entered scissors");
                    System.out.println("Player 2 entered rock");
                    System.out.println("Player 1 Lose");
                } else if (player2 == paper) {
                    System.out.println("Player 1 entered scissors");
                    System.out.println("Player 2 entered paper");
                    System.out.println("Player 1 Win");
                } else {
                    System.out.println("Draw");
                }
            }
            if (player1 == rock) {
                if (player2 == paper) {
                    System.out.println("Player 1 entered rock");
                    System.out.println("Player 2 entered paper");
                    System.out.println("Player 1 Lose");
                } else if (player2 == scissors) {
                    System.out.println("Player 1 entered rock");
                    System.out.println("Player 2 entered scissors");
                    System.out.println("Player 1 Win");
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
                } else {
                    System.out.println("Player 1 entered paper");
                    System.out.println("Player 2 entered rock");
                    System.out.println("Player 1 Win");
                }
            }
            if (player1 > 3 && player2 > 3 || player1 < 1 && player2 < 1) {
                System.out.println("Error");
                break;
            }
        }
    }
}