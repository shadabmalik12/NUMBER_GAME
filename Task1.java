import java.util.Scanner;

class Range {
    public int genrate(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

public class Task1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Range rg = new Range();
        int TotalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.print("Enter the minimum number: ");
            int min = sc.nextInt();
            System.out.print("Enter the maximum number: ");
            int max = sc.nextInt();
            sc.nextLine();

            int cnum = rg.genrate(max, min);
            int attempts = 0;

            while (true) {
                System.out.println("Guess a number between " + min + " and " + max);
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum) {
                    System.out.println("Its Greater Number");
                } else if (gnum < cnum) {
                    System.out.println("Its Lower Number");
                } else {
                    System.out.println("You Guess the Correct Number");
                    win++;
                    break;
                }
            }
            TotalAttempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / TotalAttempts * 100;
            System.out.printf("Your winrate is %.2f%% \n", winrate);

            System.out.println("Do you want to play again (yes/no)");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}