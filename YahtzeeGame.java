import java.util.Random;
import java.util.Scanner;

public class YahtzeeGame {

	public void StartGame(){
		
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		
		int run = 0;
	    int score = 0;
		
		if (input == 1){
			
		    for (int round = 0; round < 13; round++){
		    	
		    	Random rnd = new Random();
		    	
		    	int diceRollA = rnd.nextInt(6) +1;
				int diceRollB = rnd.nextInt(6) +1;
				int diceRollC = rnd.nextInt(6) +1;
				int diceRollD = rnd.nextInt(6) +1;
				int diceRollE = rnd.nextInt(6) +1;
				
				if (round == 0){
					
					score = diceRollA + diceRollB + diceRollC + diceRollD + diceRollE;
				    
				    run++;
					
				} else if (round != 0){
					
					score = score + diceRollA + diceRollB + diceRollC + diceRollD + diceRollE;
					
					run++;
					
				}
				
				if ((diceRollA == diceRollB)&&(diceRollB == diceRollC)&&(diceRollC == diceRollD)&&(diceRollD == diceRollE)){
					
					System.out.println("Yahtzee!");
					
				}
				
				System.out.println(diceRollA+" "+diceRollB+" "+diceRollC+" "+diceRollD+" "+diceRollE);
				System.out.print(diceRollA + diceRollB + diceRollC + diceRollD + diceRollE);
				System.out.print(" points");
				System.out.println(" \n");
				
				
		    } System.out.println("You have finished your 13 rolls.");
		    
		    System.out.println("Your total score is: " + score);
		    
		} else {
			
			System.out.println("Input was not 1. Ending program");
			
		}
		
	}
	
}
