
import java.util.Random;
import java.util.Scanner;

public class HandCricket {

    static void Hand_Cricket(){
        Scanner in = new Scanner(System.in);
        Random rm = new Random();

        int userScore = 0;
        int userScore1 = 0;
        int compScore = 0;
        int compScore1 = 0;
        int finalScore = 0;
        int finalScore1 = 0;

//                                                          STARTING SECTION

        System.out.println("_________________________________________Let's Play HandCricket_____________________________\n");

        System.out.println("Enter Your Choice ( 'Even(0)' or 'Odd(1)')");
        int Choice = in.nextInt();
        if (Choice == 0) {
            System.out.println("You Chhose Even");
        } else if (Choice == 1) {
            System.out.println("You Chhose Odd");
        } else {
            System.out.println("Invalid Choice");
        }


//                                                          TOSS SECTION

        System.out.println("\n____________________________It is Toss Time_________________________\n");

        System.out.println("Enter a Random NUmber From 1 to 10 : ");
        int Rand = in.nextInt();
        if (Rand > 0 && Rand <= 10) {
            System.out.println("you choose : " + Rand);
            System.out.println("Computer's Choice: ");
            int Comp = rm.nextInt(11);
            System.out.println(Comp);
            int sum = Rand + Comp;
            System.out.println("Sum of Both the Number is: " + sum);
            if (sum % 2 == 0) {
                System.out.println("The Sum of Both Choicess are : Even");
            } else {
                System.out.println("The Sum of Both Choicess are : Odd");
            }

//                                                      USER'S TURN OR COMPUTER'S TURN


            if ((sum % 2 == 0 && Choice == 0) || (sum % 2 != 0 && Choice == 1)) {
                System.out.println("\n__________It's user(Your's) Turn__________");
                System.out.println("Choose Wether you want to Bat(0) or Ball(1)");
                int Choose = in.nextInt();
                if (Choose == 0) {

//                                                      USER'S BATTING SECTION

                    System.out.println("You Choose To Bat.");
                    System.out.println("Rules are:\n1- After Choosing to Bat Computer will put random numbers and you will put the numbers you choose \n2- If your choice and the computer choice results same then you turn finishes from there \n3- At last the Numbers will be added upp\n4- At Last Your Scores will be Added up and shown to you");
                    System.out.println("\n______________________________________________Round Starts___________________________________________");

                    System.out.println("Enter Your Choice (From 1 to 10 ): ");
                    int userPick = in.nextInt();
                    System.out.println("Computer's Choice (From 1 to 10 ): ");
                    int compPick = rm.nextInt(11);
                    System.out.println(compPick);

                    if (userPick > 10 ){
                        System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                    } else if (userPick < 0) {
                        System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                    } else if (userPick == compPick) {

//                                                          AFTER DUCK OUT

                        System.out.println("_________________________Oh No!!!!!!!    You are Out_______________________________");
                        System.out.println("___________________Now Its Computer's Turn To Bat_________________________\n");

                        System.out.println("Enter Your Choice (From 1 to 10 ): ");
                        userPick = in.nextInt();

                        if (userPick > 10 ){
                            System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                        } else if (userPick < 0) {
                            System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                        }else if (userPick == compPick) {
                            System.out.println("_________________________Computer is Out_______________________________");
                        }

                        System.out.println("Computer's Choice (From 1 to 10 ): ");
                        compPick = rm.nextInt(11);
                        System.out.println(compPick);
                        compScore1 += compPick;
                        for ( int round = 0; userPick != compPick; round++) {

                            System.out.println("Enter Your Choice (From 1 to 10 ): ");
                            userPick = in.nextInt();
                            if (userPick > 10 ){
                                System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                            } else if (userPick < 0) {
                                System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                            }

                            System.out.println("Computer's Choice (From 1 to 10 ): ");
                            compPick = rm.nextInt(11);
                            System.out.println(compPick);
                            compScore += compPick;

                            finalScore1 = compScore1 + compScore;
                            System.out.println("____________________Computer's total Score is: " + finalScore1 + "____________________________");

                            if (compPick == userPick) {
                                System.out.println("The Total Score of the Computer is: " + finalScore1);
                                System.out.println("\n________________________Total Score of The USER is: " + finalScore + "_______________________");
                                System.out.println("\n________________________Total Score of The COMPUTER is: " + finalScore1 + "__________________");

                                if (finalScore > finalScore1) {
                                    System.out.println("After The Comparision Of the Total Score ! ");
                                    System.out.println("________________Congratulation's You Won!!!!!!!!!!_________________");
                                } else if (finalScore == finalScore1) {
                                    System.out.println("__________The Match Is Draw , Try again Later________________");
                                } else {
                                    System.out.println("_____________Oh no!     Computer Won__________");
                                }
                            }

                        }
//                              ENDING OF DUCK OUT
                    } else {
                        userScore += userPick;
                    }

                    for (int round = 0; userPick != compPick; round++) {
                        System.out.println("Enter Your Choice (From 1 to 10 ): ");
                        userPick = in.nextInt();
                        System.out.println("Computer's Choice (From 1 to 10 ): ");
                        compPick = rm.nextInt(11);
                        System.out.println(compPick);

                        if (userPick > 10 ){
                            System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                        } else if (userPick < 0) {
                            System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                        }else{
                            userScore1 += userPick;
                        }

                        finalScore = userScore + userScore1;
                        System.out.println("_______________________The Total Score of the User(You) is: " + finalScore + "_______________________________");

                        if (userPick == compPick) {

//                                                              COMPUTER'S BATTING INSIDE USER'S BATTING  SECTION

                            System.out.println("__________________Your and the Computer choose the Same Number 'You are Out'______________");
                            System.out.println("________________Now it's Computer's turn to bat___________");

                            System.out.println("Enter Your Choice (From 1 to 10 ): ");
                            userPick = in.nextInt();

                            if (userPick > 10 ){
                                System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                            } else if (userPick < 0) {
                                System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                            }

                            System.out.println("Computer's Choice (From 1 to 10 ): ");
                            compPick = rm.nextInt(11);
                            System.out.println(compPick);
                            compScore1 += compPick;
                            for (round = 0; userPick != compPick; round++) {

                                System.out.println("Enter Your Choice (From 1 to 10 ): ");
                                userPick = in.nextInt();
                                if (userPick > 10 ){
                                    System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                                } else if (userPick < 0) {
                                    System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                                }

                                System.out.println("Computer's Choice (From 1 to 10 ): ");
                                compPick = rm.nextInt(11);
                                System.out.println(compPick);
                                compScore += compPick;

                                finalScore1 = compScore1 + compScore;
                                System.out.println("____________________Computer's total Score is: " + finalScore1 + "____________________________");

                                if (compPick == userPick) {
                                    System.out.println("The Total Score of the Computer is: " + finalScore1);
                                    System.out.println("\n________________________Total Score of The USER is: " + finalScore + "_______________________");
                                    System.out.println("\n________________________Total Score of The COMPUTER is: " + finalScore1 + "__________________");

                                    if (finalScore > finalScore1) {
                                        System.out.println("After The Comparision Of the Total Score ! ");
                                        System.out.println("________________Congratulation's You Won!!!!!!!!!!_________________");
                                    } else if (finalScore == finalScore1) {
                                        System.out.println("__________The Match Is Draw , Try again Later________________");
                                    } else {
                                        System.out.println("_____________Oh no!     Computer Won__________");
                                    }
                                }

                            }

                        }

                    }
                } else if (Choose == 1) {

//                                                                       USER'S BALLING SECTION

                    System.out.println("You Choose To Ball");
                    System.out.println("Rules are:\n1- After Choosing to Bat Computer will put random numbers and you will put the numbers you choose \n2- If your choice and the computer choice results same then you turn finishes from there \n3- At last the Numbers will be added upp\n4- At Last Your Scores will be Added up and shown to you");


                    System.out.println("Enter Your Choice (From 1 to 10 ): ");
                    int userPick = in.nextInt();
                    if (userPick > 10 ){
                        System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                    } else if (userPick < 0) {
                        System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                    }
                    System.out.println("Computer's Choice (From 1 to 10 ): ");
                    int compPick = rm.nextInt(11);
                    System.out.println(compPick);
                    compScore1 += compPick;
                    if (userPick == compPick){
                        System.out.println("_____________________________Computer is out");
                    }
                    for (int round = 0; userPick != compPick; round++) {

                        System.out.println("Enter Your Choice (From 1 to 10 ): ");
                        userPick = in.nextInt();
                        if (userPick > 10 ){
                            System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                        } else if (userPick < 0) {
                            System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                        }

                        System.out.println("Computer's Choice (From 1 to 10 ): ");
                        compPick = rm.nextInt(11);
                        System.out.println(compPick);

                        compScore += compPick;

                        finalScore1 = compScore1 + compScore;
                        System.out.println("_______________________The Total Score of the Computer is: " + finalScore1 + " _______________________________\n");

                        if (compPick == userPick) {

//                                                          COMPUTER'S BALLING INSIDE USER'S BALLING SECTION

                            System.out.println("__________________Computer and user choose the Same Number 'Computer is Out'______________");

                            System.out.println("Enter Your Choice (From 1 to 10 ): ");
                            userPick = in.nextInt();
                            System.out.println("Computer's Choice (From 1 to 10 ): ");
                            compPick = rm.nextInt(11);
                            System.out.println(compPick);

                            if (userPick > 10 ){
                                System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                            } else if (userPick < 0) {
                                System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                            }else {
                                userScore += userPick;
                            }


                            for (round = 0; userPick != compPick; round++) {
                                System.out.println("Enter Your Choice (From 1 to 10 ): ");
                                userPick = in.nextInt();
                                System.out.println("Computer's Choice (From 1 to 10 ): ");
                                compPick = rm.nextInt(11);
                                System.out.println(compPick);
                                if (userPick > 10 ){
                                    System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                                } else if (userPick < 0) {
                                    System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                                }else {
                                    userScore1 += userPick;
                                }

                                finalScore = userScore + userScore1;


                                if (userPick == compPick) {
                                    System.out.println("_______________________The Total Score of the User(You) is: " + finalScore + "_______________________________");
                                    System.out.println("\n________________________Total Score of The COMPUTER is: " + finalScore1 + "__________________");

                                    if (finalScore1 > finalScore) {
                                        System.out.println("________________Computer Won ! Try Again Later_____________");
                                    } else if (finalScore1 == compScore1) {
                                        System.out.println("_________________The Match is a Draw_________________");
                                    } else {
                                        System.out.println("______________Congratulation's !!!!     You Won________________");
                                    }
                                }
                            }
                        }

                    }
                } else {
                    System.out.println("Invalid Choice");
                }

//                                                       COMPUTER'S BATTING SECTION

            } else {

                System.out.println("\n___________It's Computers Turn____________");
                System.out.println("Choose wether you want to Bat(0) or Ball(1)");
                int Choose = rm.nextInt(2);
                if (Choose == 0) {
                    System.out.println("Computer Choose To Bat.");
                    System.out.println("Rules are:\n1- After Choosing to Bat Computer will put random numbers and you will put the numbers you choose \n2- If your choice and the computer choice results same then you turn finishes from there \n3- At last the Numbers will be added upp\n4- At Last Your Scores will be Added up and shown to you");
                    System.out.println("\n______________________________________________Round Starts___________________________________________");

                    System.out.println("Enter Your Choice (From 1 to 10 ): ");
                    int userPick = in.nextInt();


                    System.out.println("Computer's Choice (From 1 to 10 ): ");
                    int compPick = rm.nextInt(11);
                    System.out.println(compPick);

                    if (userPick > 10 ){
                        System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                    } else if (userPick < 0) {
                        System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                    }else if (compPick == userPick) {
                        System.out.println("_________________________Computer is Out_______________________________");
                    }

                    compScore += compPick;
                    for (int round = 0; compPick != userPick; round++) {

                        System.out.println("Enter Your Choice (From 1 to 10 ): ");
                        userPick = in.nextInt();
                        if (userPick > 10 ){
                            System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                        } else if (userPick < 0) {
                            System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                        }

                        System.out.println("Computer's Choice (From 1 to 10 ): ");
                        compPick = rm.nextInt(11);
                        System.out.println(compPick);

                        compScore1 += compPick;

                        finalScore1 = compScore + compScore1;
                        System.out.println("_______________________The Total Score of the Computer is: " + finalScore1 + " _______________________________\n");

                        if (compPick == userPick) {
                            System.out.println("__________________Computer and user choose the Same Number 'Computer is Out'______________");

//                                                           USER BATTING INSIDE COMPUTER'S SECTION

                            System.out.println("Enter Your Choice (From 1 to 10 ): ");
                            userPick = in.nextInt();
                            System.out.println("Computer's Choice (From 1 to 10 ): ");
                            compPick = rm.nextInt(11);
                            System.out.println(compPick);

                            if (userPick > 10 ){
                                System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                            } else if (userPick < 0) {
                                System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                            }else if (userPick == compPick) {
                                System.out.println("_________________________You are Out_______________________________");
                            }else {
                                 userScore += userPick;
                            }

                            for (round = 0; userPick != compPick; round++) {
                                System.out.println("Enter Your Choice (From 1 to 10 ): ");
                                userPick = in.nextInt();
                                System.out.println("Computer's Choice (From 1 to 10 ): ");
                                compPick = rm.nextInt(11);
                                System.out.println(compPick);

                                if (userPick > 10 ){
                                    System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                                } else if (userPick < 0) {
                                    System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                                }else {
                                    userScore1 += userPick;
                                }
                                finalScore = userScore + userScore1;
                                System.out.println("_______________________The Total Score of the User(You) is: " + finalScore + "_______________________________");

                                if (compPick == userPick) {
                                    System.out.println("The Total Score of the Computer is: " + finalScore1);
                                    System.out.println("\n________________________Total Score of The USER is: " + finalScore + "_______________________");
                                    System.out.println("\n________________________Total Score of The COMPUTER is: " + finalScore1 + "__________________");

                                    if (finalScore > finalScore1) {
                                        System.out.println("After The Comparision Of the Total Score ! ");
                                        System.out.println("________________Congratulation's You Won!!!!!!!!!!_________________");
                                    } else if (finalScore == finalScore1) {
                                        System.out.println("__________The Match Is Draw , Try again Later________________");
                                    } else {
                                        System.out.println("_____________Oh no!     Computer Won__________");
                                    }
                                }
                            }


                        }

                    }


                } else if (Choose == 1) {

//                                                              COMPUTER'S BALLING SECTION

                    System.out.println("Computer Choose To Ball");
                    System.out.println("Rules are:\n1- After Choosing to Bat Computer will put random numbers and you will put the numbers you choose \n2- If your choice and the computer choice results same then you turn finishes from there \n3- At last the Numbers will be added upp\n4- At Last Your Scores will be Added up and shown to you");


                    System.out.println("Enter Your Choice (From 1 to 10 ): ");
                    int userPick = in.nextInt();
                    System.out.println("Computer's Choice (From 1 to 10 ): ");
                    int compPick = rm.nextInt(11);
                    System.out.println(compPick);

                    if (userPick > 10 ){
                        System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                    } else if (userPick < 0) {
                        System.out.println("You Have Entered Value That Is Less than 0 . So , The Number Will not be Added");
                    }else if (userPick == compPick) {
                        System.out.println("_________________________You are Out_______________________________");
                    }else {
                        userScore += userPick;
                    }
                    for (int round = 0; userPick != compPick; round++) {
                        System.out.println("Enter Your Choice (From 1 to 10 ): ");
                        userPick = in.nextInt();
                        System.out.println("Computer's Choice (From 1 to 10 ): ");
                        compPick = rm.nextInt(11);
                        System.out.println(compPick);

                        if (userPick > 10 ){
                            System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                        }else if (userPick < 0){
                            System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                        }else {
                            userScore1 += userPick;
                        }

                        finalScore = userScore + userScore1;
                        System.out.println("_______________________The Total Score of the USER is: " + finalScore + " _______________________________\n");

                        if (userPick == compPick) {
                            System.out.println("_________User's choice is same as Computer's Choice so User is Out!!!!!!!!!__________");

//                                                          COMPUTER'S BATTING INSIDE COMPUTER'S BATTING SECTION

                            System.out.println("Enter Your Choice (From 1 to 10 ): ");
                            userPick = in.nextInt();


                            System.out.println("Computer's Choice (From 1 to 10 ): ");
                            compPick = rm.nextInt(11);
                            System.out.println(compPick);

                            if (userPick > 10 ){
                                System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                            }else if (userPick < 0 ){
                                System.out.println("You Have Entered Value That Is Less than 0 . So , The Number Will not be Added");

                            } else if (compPick == userPick) {
                                
                            }

                            compScore += compPick;
                            for (round = 0; userPick != compPick; round++) {

                                System.out.println("Enter Your Choice (From 1 to 10 ): ");
                                userPick = in.nextInt();
                                if (userPick > 10 ){
                                    System.out.println("You Have Entered Value That Is greater than 10 . So , The Number Will not be Added");
                                } else if (userPick < 0) {
                                    System.out.println("You Have Entered Value That Is Less  than 0 . So , The Number Will not be Added");
                                }

                                System.out.println("Computer's Choice (From 1 to 10 ): ");
                                compPick = rm.nextInt(11);
                                System.out.println(compPick);

                                compScore1 += compPick;

                                finalScore1 = compScore + compScore1;
                                System.out.println("_______________________The Total Score of the Computer is: " + finalScore1 + " _______________________________\n");

                                if (compPick == userPick) {

                                    System.out.println("\n________________________Total Score of The USER is: " + finalScore + "_______________________");
                                    System.out.println("\n________________________Total Score of The COMPUTER is: " + finalScore1 + "__________________");

                                    if (finalScore > finalScore1) {
                                        System.out.println("After The Comparision Of the Total Score ! ");
                                        System.out.println("________________Congratulation's You Won!!!!!!!!!!_________________");
                                    } else if (finalScore == finalScore1) {
                                        System.out.println("__________The Match Is Draw , Try again Later________________");
                                    } else {
                                        System.out.println("_____________Oh no!     Computer Won__________");
                                    }
                                }


                            }
                        }

                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        Hand_Cricket();
        System.out.println("If You Want to Play Again.... ");
        System.out.println("\n\n_____________________________________________________________PRESS ( 0 ) : TO EXIT________________________________________________");
        System.out.println("_____________________________________________________________PRESS ( 1 ) : TO REPLAY________________________________________________\n");
        int choiceOfUser = in.nextInt();

        if (choiceOfUser == 0){
            System.out.println("__Exiting!!!!_______");
            System.out.println("__Exited!!!!_______");
        } else if (choiceOfUser == 1) {
            System.out.println("_______________________________Restarting_________________________________");
            while(choiceOfUser == 1){
                Hand_Cricket();
            }
        }else {
            System.out.println("\n\n__________________________Invalid Choice____________");
        }

    }
}



/*
                                                                            THANK YOU
                                                                           ENJOY THE GAME
                                                                     MAKE CHANGES HOWEVER YOU LIKE
                                                                I WOULD APPRECIATE YOUR RECOMMENDATION
* */