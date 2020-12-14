import java.util.Scanner;
public class Game {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
  String playerName; 
  int choice; 


  public static void main(String[] args) {
Game one; 
one = new Game();
one.playerSetUp();
  }

  public void playerSetUp(){
System.out.println("\n[CONNECTING...}");
System.out.println("\n[AUTHORIZING...}");
System.out.println("\n[SUCCESSFUL...}");
System.out.println("\nHey there, can anyone see it?");
System.out.println("\n.............................");
		System.out.println("\nMy name is Mike, I'm the crew member of the secret operation");
		playerName = myScanner.nextLine();
		
		System.out.println("Hello " + playerName + ", let's start the game!");


  }




}