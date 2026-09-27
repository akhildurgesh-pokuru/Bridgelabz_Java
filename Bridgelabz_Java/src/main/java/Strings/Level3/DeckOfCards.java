package Strings.Level3;

import java.util.Scanner;

/*
Creating and distributing a deck of cards
1) creating a deck using suits and ranks
2) initializing all cards
3) shuffling the deck
4) distributing cards to players
5) displaying cards of each player
*/

class deck{
    public String[] initialize(String[] suits,String[] ranks){ //taking suits and ranks as parameters
        String[] deck = new String[suits.length*ranks.length]; //creating deck array
        int k = 0;

        for(int i=0;i<suits.length;i++){ //looping through suits
            for(int j=0;j<ranks.length;j++){ //looping through ranks
                deck[k] = ranks[j]+" of "+suits[i]; //creating card
                k++;
            }
        }

        return deck; //returning deck
    }

    public String[] shuffle(String[] cards){ //taking deck as parameter
        int n = cards.length;

        for(int i=0;i<n;i++){ //looping through deck
            int randomCardNumber = i + (int)(Math.random()*(n-i)); //generating random card index

            String temp = cards[i]; //storing current card
            cards[i] = cards[randomCardNumber]; //swapping current card
            cards[randomCardNumber] = temp; //storing current card at random position
        }

        return cards; //returning shuffled deck
    }

    public String[][] distribute(String[] cards,int players,int cardsPerPlayer){ //taking cards and player details
        String[][] result = new String[players][cardsPerPlayer]; //creating array for players

        int k = 0;

        for(int i=0;i<players;i++){ //looping through players
            for(int j=0;j<cardsPerPlayer;j++){ //looping through cards
                result[i][j] = cards[k]; //distributing card
                k++;
            }
        }

        return result; //returning players and cards
    }

    public void display(String[][] players){ //taking players array as parameter
        for(int i=0;i<players.length;i++){ //looping through players
            System.out.println("Player "+(i+1)+":");

            for(int j=0;j<players[i].length;j++){ //looping through player's cards
                System.out.println(players[i][j]); //printing card
            }

            System.out.println();
        }
    }
}

public class DeckOfCards {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"}; //storing suits
        String[] ranks = {"2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"}; //storing ranks

        System.out.println("Enter number of players"); //taking number of players
        int players = sc.nextInt();

        System.out.println("Enter number of cards for each player"); //taking cards per player
        int cardsPerPlayer = sc.nextInt();

        int numOfCards = suits.length*ranks.length; //calculating total cards

        if(players*cardsPerPlayer>numOfCards){ //checking whether cards can be distributed
            System.out.println("Cards cannot be distributed");
            return;
        }

        deck obj = new deck(); //creating object

        String[] cards = obj.initialize(suits,ranks); //initializing deck
        cards = obj.shuffle(cards); //shuffling deck

        String[][] playersCards = obj.distribute(cards,players,cardsPerPlayer); //distributing cards

        obj.display(playersCards); //displaying player cards
    }
}