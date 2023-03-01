import java.util.ArrayList;
import java.util.Scanner;
public class GameMenu{
	private ArrayList<String> actions;
	
	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}
	
	public String getAction(){
		System.out.println("Type a number to choose an action");
		for(String m : actions){
			System.out.println(m);
		}
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		
		return choice;
		
	}
	
}