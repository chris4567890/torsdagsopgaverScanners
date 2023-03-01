import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		//System.out.println("Hello There!");
		
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
		
		GameMenu gm = new GameMenu(actions);
		
		//gm.getAction();
		
		String userChoice = gm.getAction();
		
		doAction(Integer.parseInt(userChoice));
	}
	
	
	public static void doAction(int action){
		switch(action){
			case 1:
				System.out.println("Starting the game now");
				break;
			case 2:
				System.out.println("Fetching previously saved game data");
				break;
			case 3:
				System.out.println("Game paused");
				break;
			case 4:
				System.out.println("Ending game");
				break;
			default:
				System.out.println("Not an option sorry");
		}
	}
	
	
}