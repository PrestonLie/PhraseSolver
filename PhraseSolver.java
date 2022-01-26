/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{

  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    game = new Board();
    player1 = new Player("Player 1");
    player2 = new Player("Player 2");
    solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    int currentPlayer = 2;
    Player activePlayer;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {

      /* your code here - game logic */
      // Print out the current solved Phrase
      System.out.println("Here is the current solved phrase: " + game.getSolvedPhrase()); 

      // Switch the player 
      if (currentPlayer == 1)
      {
        currentPlayer = 2;
        //set the active player
        activePlayer = player2;
      }
      else
      {
        currentPlayer = 1;
        activePlayer = player1;
      }
    
      // Print out the current player's name
      System.out.println("The current player is: " + activePlayer.getName());

      // Prompt the current player for a guess. (The player should be able to type a full phrase or a single letter for a guess.)
      System.out.println("Please enter a guess: ");
      // Scan the input
      String userGuess = input.nextLine();

      // Check to see if the phrase is solved.
      if (game.isSolved(userGuess)){
        solved = true; 
        System.out.println(activePlayer.getName()  +" just solved the puzzle!");
      }

      System.out.println("User Guessed: " + userGuess);
      // Check to see if the letter is in the phrase.
      if (game.guessLetter(userGuess)){
        activePlayer.addToPoints(game.getLetterValue());
      }
      
    } 

    System.out.println(player1.getName() + " has " + player1.getPoints());
    System.out.println(player2.getName() + " has " + player2.getPoints());
  }
  
}