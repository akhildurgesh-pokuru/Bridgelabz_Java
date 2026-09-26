package Strings.Level2;

/*
Playing Rock Paper Scissors between user and computer
1) taking user choice and generating computer choice using Math.random()
2) finding the winner based on the Rock Paper Scissors rules
3) storing the result of every game
4) finally calculating and displaying the wins, average and percentage
 */

import java.util.Scanner;

class computer_choice{
    public int choice(){   //method to generate computer choice
        return (int)(Math.random()*3)+1;   //generating random number between 1 and 3
    }
}

class find_winner{
    public String winner(int user,int computer){   //taking user and computer choices as parameters

        if(user==computer){   //checking if both choices are same
            return "Draw";
        }

        if((user==1 && computer==3) ||   //checking rock beats scissors
                (user==2 && computer==1) ||   //checking paper beats rock
                (user==3 && computer==2)){    //checking scissors beats paper
            return "User";
        }

        return "Computer";   //if user does not win, computer wins
    }
}

class statistics{
    public String[][] calculate(int userWins,int computerWins,int totalGames){   //taking wins and total games as parameters

        double userAverage = (double)userWins/totalGames;   //calculating user average
        double computerAverage = (double)computerWins/totalGames;   //calculating computer average

        double userPercentage = ((double)userWins/totalGames)*100;   //calculating user winning percentage
        double computerPercentage = ((double)computerWins/totalGames)*100;   //calculating computer winning percentage

        String[][] result = new String[3][4];   //creating 2D array to store statistics

        result[0][0] = "Player";
        result[0][1] = "Wins";
        result[0][2] = "Average";
        result[0][3] = "Percentage";

        result[1][0] = "User";
        result[1][1] = String.valueOf(userWins);
        result[1][2] = String.format("%.2f",userAverage);
        result[1][3] = String.format("%.2f%%",userPercentage);

        result[2][0] = "Computer";
        result[2][1] = String.valueOf(computerWins);
        result[2][2] = String.format("%.2f",computerAverage);
        result[2][3] = String.format("%.2f%%",computerPercentage);

        return result;   //returning the statistics array
    }
}

class display_results{
    public void display(String[][] games,String[][] statistics){   //taking game results and statistics as parameters

        System.out.println("\nGame Results");

        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Game","User Choice","Computer Choice","Winner");

        for(int i=0;i<games.length;i++){   //looping through every game result
            System.out.printf("%-10s %-15s %-15s %-15s%n",
                    games[i][0],games[i][1],games[i][2],games[i][3]);
        }

        System.out.println("\nStatistics");

        System.out.printf("%-12s %-10s %-12s %-15s%n",
                statistics[0][0],statistics[0][1],
                statistics[0][2],statistics[0][3]);

        for(int i=1;i<statistics.length;i++){   //looping through statistics
            System.out.printf("%-12s %-10s %-12s %-15s%n",
                    statistics[i][0],statistics[i][1],
                    statistics[i][2],statistics[i][3]);
        }
    }
}

public class RockPaperScissor {   //main class
    public static void main(String[] args) {   //main method

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of games: ");   //taking number of games as input
        int numberOfGames = sc.nextInt();

        String[][] games = new String[numberOfGames][4];   //creating 2D array to store game results

        int userWins = 0;
        int computerWins = 0;

        computer_choice obj1 = new computer_choice();   //creating object for computer choice
        find_winner obj2 = new find_winner();   //creating object for finding winner

        for(int i=0;i<numberOfGames;i++){   //looping through every game

            System.out.println("\nGame "+(i+1));
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            System.out.println("Enter your choice: ");   //taking user choice
            int user = sc.nextInt();

            while(user<1 || user>3){   //checking whether user entered valid choice
                System.out.println("Invalid choice. Enter 1, 2 or 3: ");
                user = sc.nextInt();
            }

            int computer = obj1.choice();   //generating computer choice

            String winner = obj2.winner(user,computer);   //finding winner

            if(winner.equals("User")){   //checking if user wins
                userWins++;
            }else if(winner.equals("Computer")){   //checking if computer wins
                computerWins++;
            }

            games[i][0] = String.valueOf(i+1);   //storing game number
            games[i][1] = getChoice(user);   //storing user choice
            games[i][2] = getChoice(computer);   //storing computer choice
            games[i][3] = winner;   //storing winner
        }

        statistics obj3 = new statistics();   //creating object for statistics
        String[][] result = obj3.calculate(userWins,computerWins,numberOfGames);   //calculating statistics

        display_results obj4 = new display_results();   //creating object for displaying results
        obj4.display(games,result);   //displaying game results and statistics
    }

    public static String getChoice(int choice){   //method to convert number into choice name

        if(choice==1){
            return "Rock";
        }else if(choice==2){
            return "Paper";
        }else{
            return "Scissors";
        }
    }
}