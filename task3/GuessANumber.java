import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
		
		makeAGuess();
 	}


    private static void makeAGuess(){
		System.out.println("type your guess");
		Scanner scan = new Scanner(System.in);
		
		//int guess = scan.nextInt();
		//scan.nextLine();	
    	//source: https://www.javatpoint.com/post/java-scanner-hasnextdouble-method
		if(scan.hasNextDouble()){
			double guess = scan.nextDouble();
			if(guess > rnd_number){
				System.out.println("number is too high try again");
				makeAGuess();
			}else if(guess < rnd_number){
				System.out.println("number is too low try again");
				makeAGuess();
			}else if(guess == rnd_number){
				System.out.println("You guessed it congratulation ask the teacher for free cocoa");
			}	
		}else if (scan.hasNext()){
			System.out.println("Not a number try again even tough you can only type numbers");
			makeAGuess();
		}
		
        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

}
