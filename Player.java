/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) */ 
  public Player(){

  }
  public Player(String inputName){
    setName(inputName);
  }
  /* your code here - accessor(s) */ 
public String getName(){
  return name;
}
public int getPoints(){
  return points;
}
  /* your code here - mutator(s) */
  public void setName(String inputName){
    name = inputName;
  }
  public void addToPoints(int value){
    points = value + points;
  }
}