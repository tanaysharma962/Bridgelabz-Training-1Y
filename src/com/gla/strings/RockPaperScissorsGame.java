package strings;

import java.util.Scanner;

public class RockPaperScissorsGame {


    public static String getComputerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }


    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }


    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = ((double)userWins / totalGames) * 100;
        double compPercent = ((double)compWins / totalGames) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }


    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i+1) + "\t" + games[i][0] + "\t" +
                    games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\n--- Final Statistics ---");
        System.out.println("Player\tWins\tWinning %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();

        String[][] games = new String[totalGames][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("\nEnter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);

        displayResults(games, stats);

        sc.close();
    }
}

