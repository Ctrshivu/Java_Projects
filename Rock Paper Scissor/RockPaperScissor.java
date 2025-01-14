import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rm = new Random();
        int userScore = 0;
        int compScore = 0;

//        INTRO ROUND

        System.out.println("\n_____________Rock Paper Scissor Game Begins_____________");
        System.out.println("______________________Game Starts_______________________");
        System.out.println("0- Rock\n1- Paper\n2- Scissor");
        System.out.println("______________________Round Begins_____________________\n");


//        ROUND YOU WANT TO PLAY

        System.out.println("___________________How Many Rounds You Want To Play: ____________________");
        int gameRounds = in.nextInt();
        int rounds = 1;



//        INPUT ROUND

        while(rounds <= gameRounds) {

            System.out.println("User's Choice: ");
            int userChoice = in.nextInt();
            System.out.println("Computer's Choice: ");
            int compChoice = rm.nextInt(3);
            System.out.println(compChoice);


//        WHAT DID USER CHOOSE

                if (userChoice == 0 && compChoice == 1) {
                    System.out.println("\nUser Selected Rock");
                    System.out.println("Computer Selected Paper");
                    System.out.println("\n_____________________Computer Wins__________________________");
                    compScore += 1;
                } else if (userChoice == 0 && compChoice == 2) {
                    System.out.println("\nUser Selected Rock");
                    System.out.println("Computer Selected Scissor");
                    System.out.println("\n_____________________User Wins__________________________");
                    userScore += 1;
                }  else if (userChoice == 0 && compChoice == 0) {
                    System.out.println("\nUser Selected Rock");
                    System.out.println("Computer Selected Rock");
                    System.out.println("\n_____________________It Is A Draw__________________________");
                }  else if (userChoice == 1 && compChoice == 0) {
                    System.out.println("\nUser Selected Paper");
                    System.out.println("Computer Selected Rock");
                    System.out.println("\n_____________________User Wins__________________________");
                    userScore += 1;
                }  else if (userChoice == 1 && compChoice == 1) {
                    System.out.println("\nUser Selected Paper");
                    System.out.println("Computer Selected Paper");
                    System.out.println("\n_____________________It Is A Draw__________________________");
                } else if (userChoice == 1 && compChoice == 2) {
                    System.out.println("\nUser Selected Paper");
                    System.out.println("Computer Selected Scissors");
                    System.out.println("\n_____________________Computer Wins__________________________");
                    compScore += 1;
                } else if (userChoice == 2 && compChoice == 0) {
                    System.out.println("\nUser Selected Scissors");
                    System.out.println("Computer Selected Rock");
                    System.out.println("\n_____________________Computer Wins__________________________");
                    compScore += 1;
                } else if (userChoice == 2 && compChoice == 1) {
                    System.out.println("\nUser Selected Scissors");
                    System.out.println("Computer Selected Paper");
                    System.out.println("\n_____________________User Wins__________________________");
                    userScore += 1;
                }  else if (userChoice == 2 && compChoice == 2) {
                    System.out.println("\nUser Selected Scissors");
                    System.out.println("Computer Selected Scissors");
                    System.out.println("\n_____________________It Is A Draw__________________________");
                } else {
                    System.out.println("\nInvalid Input\n");
                }

                System.out.println("Rounds : " + rounds + " Completed");
                rounds++;

//            SCORE SECTION

                System.out.println("\nTotal Score Over All is  ");
                System.out.println("_____________________User Score: " + userScore);
                System.out.println("_____________________Computer's Score: " + compScore);

//            SCORE CONDITION CHECK

            if (userScore > compScore ){
                System.out.println("__________________________________________________You Won________________________________________");
            } else if (userScore < compScore) {
                System.out.println("__________________________________________________Computer Won________________________________________");
            }else {
                System.out.println("__________________________________________________It Is A Draw________________________________________");

            }

        }


    }
}
