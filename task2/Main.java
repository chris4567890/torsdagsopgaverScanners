import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type your name: ");
		String name = scan.nextLine();
		//scan.nextLine();
		System.out.println("Hello there! "+name);
		System.out.println("Please type your age: ");
		int age = scan.nextInt();
		System.out.println("Your age is: "+age);
		int calculatedRetirementAge = 67-age;
		
		if(age < calculatedRetirementAge){
			System.out.println("You have "+calculatedRetirementAge+ " year(s) until retirement");
		}else{
			System.out.println("either a wrong input or you are already retired or both");
		}
		
	}
}